package dsa_stack_practise_30th_april_2022;

import java.util.ArrayList;
import java.util.List;

public class AjayBharskaleCode {

	List<Integer> al = new ArrayList<>();

	public void push(int data) {
		al.add(data);
	}

	public boolean isEmpty() {
		return al.size() == 0;
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		}
		int val = al.remove(al.size() - 1);

		return val;
	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return al.get(al.size() - 1);
	}

	public static void main(String args[]) {
		AjayBharskaleCode stack = new AjayBharskaleCode();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();

		while (!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();

		}
	}

}
