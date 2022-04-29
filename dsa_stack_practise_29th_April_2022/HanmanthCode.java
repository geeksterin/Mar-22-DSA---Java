package dsa_stack_practise_29th_April_2022;

import java.util.Stack;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "(()){}[]";

		boolean valid = validParanthesis(a);
		System.out.println(valid);

	}

	private static boolean validParanthesis(String a) {
		// TODO Auto-generated method stub
		boolean valid = false;
		Stack<Character> s = new Stack();
		int count = 0;

		if(a==null)
		{
			return false;
		}
		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			// char top = a.charAt(i + 1);
			if (ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
				count++;
			} else if ((ch == ')' && s.peek() == '(') || (ch == '}' && s.peek() == '{')
					|| (ch == ']' && s.peek() == '[')) {
				s.pop();
				count--;
			} else {
				valid = false;
			}

			System.out.println("content : "+s.toString());
		}
		
		System.out.println("Count : "+count);

		if (count==0) {
			valid = true;
		} else {
			valid = false;
		}

		return valid;
	}

}
