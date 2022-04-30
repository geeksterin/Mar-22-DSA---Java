package dsa_stack_practise_30th_april_2022;

import java.util.LinkedList;
import java.util.List;

public class StackLL {

	List<Integer> list = new LinkedList<Integer>();

	int push(int data) {
		list.add(data);

		return list.get(list.size() - 1);
	}

	int pop() {
		if (list.isEmpty()) {
			System.out.println("List is empty!");
			return -1;
		}

		int val = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return val;

	}
	
	int peek() {
		if (list.isEmpty()) {
			System.out.println("List is empty!");
			return -1;
		}

		int val = list.get(list.size() - 1);
		return val;
	}
	
	boolean isEmpty() {
		return list.isEmpty();
	}
	
	void display() {
		if(list.isEmpty())
		{
			System.out.println("List is empty!");
			return;
		}
		System.out.println(list);
	}

}
