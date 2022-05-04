package dsa_practise_4th_may_2022;

import java.util.Arrays;

public class FindThePivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 7, 3, 6, 5, 6, 0, -1 };
		int pi = pivotIndex(arr);
		System.out.println(pi);

	}

	private static int pivotIndex(int[] arr) {
		int sumRight = findSum(arr);
		int sumLeft = 0;

		for (int i = 0; i < arr.length; i++) {
			
			sumRight = sumRight - arr[i];
			
			if (sumRight == sumLeft)
				return i;
			sumLeft = sumLeft + arr[i];
		}
		return -1;
	}

	private static int findSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		return sum;
	}

}
