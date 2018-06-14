package test1;

public class StringUtils {

	public static String toAlternativeString(String string) {
		StringBuilder sb = new StringBuilder(string.length());
		
		for(char character : string.toCharArray()) {
			if(Character.isLowerCase(character)) {
				sb.append(Character.toUpperCase(character));
			} else {
				sb.append(Character.toLowerCase(character));
			}
		}
		return sb.toString();
	}	
	
}
