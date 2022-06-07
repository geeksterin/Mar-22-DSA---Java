package dsa_practise_6th_June_2022;

import java.util.Stack;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 252;
		
		//System.out.println(x << 6);
		
		Stack<Integer> st = new Stack<Integer>();
	
		
		while(x!=0) {
			int rem = x%2;

			x = x/2;
			st.push(rem);
		}
		
		System.out.println(st);
		System.out.println("st.size " +st.size());
		//st.
		
		for(int i =st.size()-1;i>=0;i--) {
			/*
			 * int y = st.peek(); System.out.println("Peek "+ y);
			 * System.out.println(st.pop());
			 */
			
			System.out.print(st.get(i)+"");
		}
	}

}
