package amazoninterviewquestion;

public class FillTheGapWithWater {

   public static int checkIfPossible(int[] inputs) {
       int result = 0;

       for (int i = 1; i < inputs.length; i++) {
           int prev = inputs[i-1];
           if(prev > inputs[i])
               result += (prev - inputs[i]);
       }

       return result;
   }
}
