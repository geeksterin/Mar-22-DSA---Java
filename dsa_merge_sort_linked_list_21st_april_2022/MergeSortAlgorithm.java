package dsa_merge_sort_linked_list_21st_april_2022;

import java.util.Arrays;

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 1, 2, 4, 6, 8 };

		int start = 0;
		int end = a.length - 1;

		System.out.println("Before -> " + Arrays.toString(a));
		mergeSort(a, start, end);
		System.out.println("After -> " + Arrays.toString(a));

	}

	private static void mergeSort(int[] a, int start, int end) {

		if (start >= end) {
			return;
		}

		else {
			int mid = (start + end) / 2;

			mergeSort(a, start, mid);
			mergeSort(a, mid + 1, end);

			merge(a, start, end, mid);
		}

	}

	private static void merge(int[] a, int start, int end, int mid) {

		int temp[] = new int[(end - start) +1];

		int i = start;
		int j = mid + 1;
		int k = 0;
	
		// compare left and right array
		while (i <= mid && j <= end) {
			if (a[i] <= a[j]) {
				temp[k] = a[i];
				k++;
				i++;
			} else {
				temp[k] = a[j];
				k++;
				j++;
			}
		}
		
		// left array exhausted and still elements are there on right array
		while (i > mid && j <= end) {
			temp[k] = a[j];
			k++;
			j++;
		}

		// right array exhausted and still elements are there on left array
		while (j > end && i <= mid) {
			temp[k] = a[i];
			k++;
			i++;

		}

		// temp array to original

		for (int m = start; m <= end; m++) {
			a[m] = temp[m - start];
		}
	}

}
