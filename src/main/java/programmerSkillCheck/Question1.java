package programmerSkillCheck;

import java.util.ArrayList;

public class Question1 {
    public static int[] solution(long n) {
        String num = Long.toString(n);
        String[] param = num.split("");
        int[] answer = new int[param.length];

        for(int i = 0; i < param.length; i++){
            answer[i] = Integer.parseInt(param[param.length - i - 1]);
        }

        return answer;
    }
}