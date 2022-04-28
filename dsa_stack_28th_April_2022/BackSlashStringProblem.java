package dsa_stack_28th_April_2022;

import java.util.Stack;

public class BackSlashStringProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "a#c";
		String t = "b";

		System.out.println(validate(s, t));
	}

	static boolean validate(String s, String t) {

		String s1 = removeBackspace(s);
		System.out.println("Stack1 : "+s1);

		String s2 = removeBackspace(t);
		System.out.println("Stack2 : "+s2);


		if (s1.equals(s2)) {
			return true;
		}

		return false;
	}

	private static String removeBackspace(String s) {

		Stack<Character> st = new Stack();
		
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);

			if (ch != '#') {
				st.push(ch);
			}

			else {
				st.pop();
			}

		}

		return st.toString();

	}

}
