package dsa_practise_String_8th_May_2022;

public class ShubhamCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to world .you are always welcome anytime ";
		String word = "Welcome";
		//str = str.toLowerCase();
		//String s = word.toLowerCase();
		//System.out.println(s);
		System.out.println(count(str, word));
	}

	static int count(String str, String word) {
		String a[] = str.split(" ");

		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (word.equalsIgnoreCase(a[i]))
				count++;
		}

		return count;
	}
}
