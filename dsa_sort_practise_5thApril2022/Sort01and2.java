package dsa_sort_practise_5thApril2022;

import java.util.Arrays;

public class Sort01and2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 2, 2, 1, 1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0, 0 };

		sort(a);

		System.out.println(Arrays.toString(a));

	}

	private static void sort(int[] a) {

		int count1 = 0;
		int count0 = 0;
		int count2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count0++;
			}

			else if (a[i] == 1) {
				count1++;
			}

			else {
				count2++;
			}

		}
		
		System.out.println("count0 : "+count0);
		System.out.println("count1 : "+count1);
		System.out.println("count2 : "+count2);


		for (int i = 0; i < count0; i++) {
			a[i] = 0;
		}

		System.out.println(count0);
		for (int i = count0; i < (count0+count1); i++) {
			a[i] = 1;
		}

		for (int i = count0+count1; i < a.length; i++) {
			a[i] = 2;
		}

	}
}
