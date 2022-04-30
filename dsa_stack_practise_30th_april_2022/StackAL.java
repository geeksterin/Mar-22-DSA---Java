package dsa_stack_practise_30th_april_2022;

import java.util.ArrayList;
import java.util.List;

public class StackAL {

	List<Integer> list = new ArrayList<Integer>();

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
		list.remove(list.get(list.size() - 1));
		return val;

	}

	int peek() {

		if (list.isEmpty()) {
			System.out.println("List is empty!");

			return -1;
		}
		return list.get(list.size() - 1);
	}
	
	boolean isEmpty() {
		return list.isEmpty();
	}
	
	void display() {
		if(list.isEmpty()) {
			System.out.println("List is empty!");
		}
		
		for(int i =0;i<list.size();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();

	}

}
