package test3;

public class MaxDiffLength {

	public static int mxdiflg(String[] a1, String[] a2) {
		int max = 0;
		
		if(a1.length < 1 || a2.length < 1) {
			return -1;
		}
		
		for(int i = 0; i < a1.length; i++) {
			for(int j = 0; j < a2.length; j++) {
				if(max < Math.abs(a1[i].length() - a2[j].length())) {
					max = Math.abs(a1[i].length() - a2[j].length());
				}				
			}
		}
		return max;
	}

}
