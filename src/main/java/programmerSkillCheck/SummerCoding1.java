package programmerSkillCheck;

/**
 * 문제 설명
 * 2016년은 아름다운 연도입니다. 아름다운 연도란, 연도를 구성하는 0부터 9까지의 숫자가 중복 없이 사용된 연도를 의미합니다. 즉, 2016년도는 2가 1번, 0이 1번, 1이 1번, 6이 1번씩 사용되었기 때문에 아름다운 연도라 부릅니다. 하지만 2344년도는 4가 2번씩 사용되었기 때문에 아름다운 연도라고 하지 않습니다.
 * 아름다운 연도는 2015년도, 2016년도처럼 연속해서 존재하는 경우도 있지만, 특정 연도 이후로 굉장히 오랫동안 나오지 않을 때도 있습니다. 예를 들어, 1987년도 이후 처음 등장하는 아름다운 연도는 2013년도입니다. 특정 연도 P가 매개변수로 주어질 때, 해당 연도보다 큰 아름다운 연도 중 가장 작은 아름다운 연도를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 연도 P : 1,000 이상 10,000 이하의 자연수
 * 입출력 예
 * P	answer
 * 1987	2013
 * 2015	2016
 * 입출력 예 설명
 * 입출력 예 #1
 * 1987년 이후의 아름다운 연도중 가장 작은 아름다운 연도는 2013년도 입니다.
 *
 * 입출력 예 #2
 * 2015년 이후의 아름다운 연도중 가장 작은 아름다운 연도는 2016년도 입니다.
 */

public class SummerCoding1 {
    public static int solution(int p) {
        int answer = p;

        // 아름다운 자연수 구하기.
        while(returnLeastBeautifulNum(++p) != 1) {
            // exception , p = 1000이상 10000이하의 자연수
            if(1000 < p && p > 10000) {
                return -1;
            }
        }

        answer = p;

        return answer;
    }

    /**
    * 가장 작은 아름다운 번호 검증
    * */
    public static int returnLeastBeautifulNum(int p) {
        String pStr = String.valueOf(p);
        for (int i = 0; i < pStr.length(); i++) {
            for (int j = pStr.length() - 1; j > 0; j--) {
                // 같은 인덱스는 비교할 필요 없음.
                if(i == j) continue;

                // 하나라도 중복되면 아름다운자연수가 아님
                if(pStr.charAt(j) == pStr.charAt(i)) return -1;
            }
        }

        return 1;
    }
}

