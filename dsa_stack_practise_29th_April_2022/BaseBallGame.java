package dsa_stack_practise_29th_April_2022;

import java.util.Stack;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] ops = {"5","-2","4","C","D","9","+","+"};

		int sum = finalScore(ops);
		System.out.println(sum);

	}

	private static int finalScore(String[] ops) {

		int sum = 0;
		Stack<Integer> st = new Stack();

		if (ops.length <= 0) {
			return sum;
		}

		else {

			for (int i = 0; i < ops.length; i++) {
				String val = ops[i];

				if (val == "C") {
					st.pop();
				}

				else if (val == "D") {
					st.push(st.peek() * 2);
				}

				else if (val == "+") {
					int prev1 = st.peek();
					st.pop();

					int prev2 = st.peek();
					st.push(prev1);

					int sum_of_two_previous_scores = prev1 + prev2;

					st.push(sum_of_two_previous_scores);

				}

				else {
				//	int x = Integer.parseInt(val);
					int x = val.charAt(0)-'A';
					
					System.out.println("x->"+x);
					st.push(x);
				}
			}
		}

		for (int i = st.size() - 1; i > -1; i--) {
			sum += st.pop();
		}
		return sum;

	}

}
