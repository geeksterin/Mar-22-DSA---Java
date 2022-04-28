package dsa_stack_28th_April_2022;

import java.util.Stack;

public class StackClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack s = new MyStack();

		s.push(10);
		s.push(60);
		s.push(40);
		s.push(90);

		s.display();
		System.out.println("Peek : " + s.peek());

		s.pop();
		s.display();
		s.pop();
		s.pop();

		System.out.println("-----------");
		s.display();
		s.pop();
		s.display();
		s.peek();
		s.pop();

		s.push(100);
		s.display();

		Stack<Character> st = new Stack<Character>();
		
		st.push('A');
		
		System.out.println(st.toString());
		
		st.toString();

	}

}
