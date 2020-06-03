package programmerHash;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
    문제 설명
    수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

    마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.
    입출력 예
    participant	completion	return
    [leo, kiki, eden]	[eden, kiki]	leo
    [marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
    [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
    입출력 예 설명
    예제 #1
    leo는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

    예제 #2
    vinko는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

    예제 #3
    mislav는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
public class FindIncompleteOne {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
//        웹 사이트 테스트 컴파일러에 해시맵이 없어서 실행 안됨.
//        Map hashCompletion = new HashMap<>();
//
//        for (String p2: completion) {
//            hashCompletion.put(p2, p2);
//        }
//
//        for(String p1 : participant) {
//            if (!hashCompletion.containsKey(p1)) {
//                answer = p1;
//            } else {
//                hashCompletion.remove(p1);
//            }
//        };

//        이것도 없네 ㅡㅡ
//        List<String> participantList = new ArrayList();
//
//        for (String part: participant) {
//            participantList.add(part);
//        }
//
//        for (int i=0; i<completion.length; i++) {
//            if(participantList.get(i) != completion[i]) {
//                answer = participantList.get(i);
//                participantList.remove(i);
//            }
//        }

        // 효율성 통과 못함..
        for (int i = 0; i < completion.length; i++) {
            for (int j = 0; j < participant.length; j++) {
                if(completion[i].equals(participant[j])) {
                    participant[j] = "checked";
                    break;
                }
            }
        }

        for(String part : participant) {
            if(!part.equals("checked")) {
                answer = part;
                System.out.println(answer);
            }
        }

        return answer;
    }
}