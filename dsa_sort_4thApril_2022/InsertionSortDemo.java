package dsa_sort_4thApril_2022;

import java.util.Arrays;

public class InsertionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 8, 4, 1, 7 };

		int b[] = insertionSort(a);
		System.out.println(Arrays.toString(b));

	}

	private static int[] insertionSort(int[] a) {

		// unsorted array loop
		int key = 0;
		for (int i = 1; i < a.length; i++) {
			key = a[i];

			int j = i - 1;

			// sorted array -> traverse, find the right position for key
			
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}

			a[j + 1] = key;

		}

		return a;

	}

}
