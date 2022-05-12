package dsa_string_practise_12th_May_2022;

public class AmanCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "flower", "flowers", "flower" ,"fl","f"};
		String prefix = longestCommonPrefix(s);
		System.out.println(prefix);
	}

	public static String longestCommonPrefix(String[] S) {
		String p = S[0]; //flower
		for (int i = 1; i < S.length; i++) {
			while (S[i].indexOf(p) != 0) {
				// System.out.println(S[i]);
				p = p.substring(0, p.length() - 1);
			}
		}
		//System.out.println(p);
		
		return p;

	}

}
