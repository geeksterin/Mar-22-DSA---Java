package dsa_stack_practise_29th_April_2022;

import java.util.Stack;

public class CheckValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "[(])";

		boolean valid = validParanthesis(a);
		System.out.println(valid);

	}

	private static boolean validParanthesis(String a) {
		// TODO Auto-generated method stub
		boolean valid = false;
		Stack<Character> s = new Stack();

		if (a == null && a.isEmpty()) {
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			if (ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			}

			else {

				if (s.isEmpty()) {
					return false;
				}

				else if ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{')
						|| (ch == ']' && s.peek() == '[')) {

					s.pop();
				} else {
					valid = false;
				}

			}

		}
		return s.isEmpty();
		
	}

}
