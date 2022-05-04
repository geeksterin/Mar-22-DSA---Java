package dsa_practise_4th_may_2022;

import java.util.Arrays;

public class SortByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 11, 4, 2, 5, 7, 9, 12, 1, 8, 0 };
		int i = 0;
		int j = 1;

		while (i < nums.length && j < nums.length) {
			if (nums[i] % 2 == 1 && nums[j] % 2 == 0)
				swap(nums, i, j);

			else if (nums[i] % 2 == 0)
				i += 2;

			else
				j += 2;

		}

		System.out.println(Arrays.toString(nums));
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
