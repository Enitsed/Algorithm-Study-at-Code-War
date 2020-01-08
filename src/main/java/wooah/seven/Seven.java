package wooah.seven;

public class Seven {

    public static int solution(int number) {
        int answer = 0;
        String[] listOf = new String[] { "3", "6", "9"};

        for(int i=0; i<number; i++) {
            String comp = String.valueOf(i);

            for(String a : listOf) {
                for(String b : comp.split("")) {
                    if(b.contains(a)){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }

}
