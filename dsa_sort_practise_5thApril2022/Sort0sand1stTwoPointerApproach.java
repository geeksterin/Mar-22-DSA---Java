package dsa_sort_practise_5thApril2022;

import java.util.Arrays;

public class Sort0sand1stTwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1 };

		// a= {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1}

		sort(a);
		// a = sort1(a);

		System.out.println(Arrays.toString(a));

	}

	private static int[] sort1(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			if (arr[start] == 1 && arr[end] != 1) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			if (arr[end] == 1) {
				end--;
			}
			if (arr[start] == 0) {
				start++;
			}

		}

		return arr;
	}

	private static int[] sort(int[] a) {

		int left = 0;
		int right = a.length - 1;

		// Keep doing the below actions until left < right

		while (left < right) {

			if (a[left] == 0) {
				left++; // 1
			}

			if (a[right] == 1) {
				right--;
				// 5 }
			}

			if (a[left] == 1 && a[right] == 0) {
				// swap
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}

		}
		return a;
	}

}
