package dsa_string_practise_12th_May_2022;

public class AyeshaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AABAAB";
		int count = 0;

		for (int i = 0; i < str.length() - 1; i++) {

			Character ch1 = str.charAt(i);
			Character ch2 = str.charAt(i + 1);

			if (ch1.equals(ch2)) {
				count++;
			}
		}

		System.out.println(count);

	}

}
