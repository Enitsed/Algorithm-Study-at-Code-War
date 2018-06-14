package test9;

public class Troll {
	public static String disemvowel(String str) {
		// Code away...
		char[] tempArr = str.toCharArray();
		String result = "";
		for (char letter : tempArr) {
			if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I'
					|| letter == 'o' || letter == 'O' || letter == 'u' || letter == 'U') {
				result += "";
			} else {
				result += letter;
			}
		}
		return result;
	}
}