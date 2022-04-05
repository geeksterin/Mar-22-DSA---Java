package dsa_sort_practise_5thApril2022;

import java.util.Arrays;

public class Sort0sand1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1 };

		// a= {0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1}

		a = sort(a);

		System.out.println(Arrays.toString(a));

	}

	private static int[] sort(int[] a) {

		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		System.out.println("0 appears " + count + " times");

		/*
		 * for (int i = 0; i < count; i++) { a[i] = 0; }
		 * 
		 * for (int i = count; i < a.length; i++) { a[i] = 1; }
		 */

		for (int i = 0; i < a.length; i++) {
			if (i < count) {
				a[i] = 0;
			}

			else {
				a[i] = 1;
			}
		}

		return a;
	}

}
