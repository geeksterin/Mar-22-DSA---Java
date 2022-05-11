package dsa_practise_arrays_11th_May_2022;

public class AjayJCode {

	public static void main(String[] args) {
		String str = "a,b$c";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			Character ch = str.charAt(i);
			if (ch.isLetter(ch)) {
				rev = rev + ch;
			}
		}
		System.out.println("rev: "+rev);

		int j = 0;
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			Character ch = str.charAt(i);
			if (ch.isLetter(ch)) {
				temp = temp + rev.charAt(j);
				j++;
			} else {
				temp = temp + ch;
				// System.out.println(temp);
			}
		}
		System.out.println(temp);

	}

}
