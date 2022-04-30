package dsa_stack_practise_30th_april_2022;

import java.util.Stack;

public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,0,1,1,2,2,3,4,5,5};
		
		Stack<Integer> s = new Stack();
		for(int i =0;i<a.length;i++)
		{
			if(s.isEmpty())
			{
				s.push(a[i]);
			}
			
			else {
				int val = s.peek();
				if(val != a[i])
				{
					s.push(a[i]);
				}
			}
		}
		
		System.out.println(s.toString());
	}

}
