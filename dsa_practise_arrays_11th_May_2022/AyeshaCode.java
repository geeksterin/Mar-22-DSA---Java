package dsa_practise_arrays_11th_May_2022;

public class AyeshaCode {
	public static void main(String[] args) {
		String str = "Ayesh@@@18";
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
		if (digite >= 1 && upper >= 1 && lower >= 1 && spcl >= 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
