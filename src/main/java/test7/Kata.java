package test7;

public class Kata {

	public static String getMiddle(String word) {
		int middleIndex = word.length() / 2;
		return word.length()%2 == 0 ? word.substring(middleIndex-1, middleIndex+1) : word.substring(middleIndex, middleIndex+1);
	}

}
