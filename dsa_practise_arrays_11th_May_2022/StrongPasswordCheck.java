package dsa_practise_arrays_11th_May_2022;

public class StrongPasswordCheck {

	public static void main(String[] args) {

		String s = "ydcfv^5676";
		boolean bool = strogpassword(s);
		System.out.println(bool);
	}

	public static boolean strogpassword(String str) {

		int digite = 0;
		int upper = 0;
		int lower = 0;
		int spcl = 0;
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch.isDigit(ch)) {
				digite++;
			} else if (ch.isUpperCase(ch)) {
				upper++;
			} else if (ch.isLowerCase(ch)) {
				lower++;
			} else if (!ch.isLetterOrDigit(ch)) {
				spcl++;
			}
		}
		if (digite >= 1 && upper >= 1 && lower >= 1 && spcl >= 1 && str.length() >= 8) {
			return true;
		} else {
			return false;
		}
	}
}
