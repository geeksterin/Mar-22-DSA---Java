package dsa_practise_string_10th_May_2022;

public class FindWordsWithCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "saveChangesInTheEditor";

		int count = 1;
		for (int i = 0; i < s.length(); i++) {

			char ch = s.charAt(i);
			int ascii = (int) ch;

			if (ascii >= 65 && ascii <= 90) {
				count++;
			}

		}

		System.out.println(count);

		int counter = 1;
		for (int i = 0; i < s.length(); i++) {

			Character ch = s.charAt(i);
			int ascii = (int) ch;

			if (ch.isUpperCase(ch)) {
				count++;
			}
			
			

		}

		System.out.println(counter);

	}

}
