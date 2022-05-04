package dsa_practise_4th_may_2022;

import java.util.Arrays;

public class DebasishCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 4, 2, 5, 7, 9, 12, 1, 8 };

		int start = 0;
		int end = nums.length - 1;

		while (start < nums.length && end > 0) {
			if (nums[start] % 2 == 0 && nums[end] % 2 != 0) {
				start += 2;
				end -= 2;
			} else if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
				swap(nums, start, end);
				start += 2;
				end -= 2;
			} else if (nums[start] % 2 != 0 && nums[end] % 2 != 0)
				end -= 2;
			else
				start += 2;
		}

		System.out.println(Arrays.toString(nums));
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
