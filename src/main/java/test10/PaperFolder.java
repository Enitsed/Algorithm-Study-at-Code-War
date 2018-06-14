package test10;

public class PaperFolder {
	public static Long fold(Double distance) {
		if (distance < 0)
			return null;
		double paper = 0.0001;
		Long count = 0l;
		while (distance > paper) {
			paper = paper * 2;
			count++;
		}
		return count;
	}
}