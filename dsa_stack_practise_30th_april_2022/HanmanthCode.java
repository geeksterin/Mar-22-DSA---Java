package dsa_stack_practise_30th_april_2022;

import java.util.Stack;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9,9,9 };
		removeDupticate(arr);

	}

	private static void removeDupticate(int[] arr) {
		// TODO Auto-generated method stub

		Stack<Integer> a = new Stack();
		System.out.println("size : "+arr.length);

		for (int i = 0; i < arr.length -1; i++) {
			System.out.println("i : "+i);
			System.out.println("arr[i] : "+arr[i]);
			if (arr[i] != arr[i + 1])
				a.push(arr[i]);
		}
		a.push(arr[arr.length -1]);

		System.out.println(a);

	}

}