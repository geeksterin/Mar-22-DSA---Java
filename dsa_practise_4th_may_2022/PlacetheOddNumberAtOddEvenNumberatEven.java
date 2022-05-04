package dsa_practise_4th_may_2022;

import java.util.Arrays;

public class PlacetheOddNumberAtOddEvenNumberatEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4, 2, 5, 7, 9, 12, 1, 8 };

		int k = 0;
		int i = 0;
		int j = 1;
		
		while (k < a.length) {

			System.out.println("a[k] : "+a[k]);

			if (a[k] % 2 == 0 && i < a.length) {
				i += 2;
			} else if (a[k] % 2 == 1 && j < a.length) {
				j = j + 2;
			}
			
			System.out.println("before swap : ");
			
			System.out.println("i : "+i);
			System.out.println("j : "+j);


			System.out.println(Arrays.toString(a));

			// swap the elements between i and j
			if (i < a.length && j < a.length && a[i] % 2 == 1 && a[j] % 2 == 0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				i = i + 2;
				j = j + 2;
			}
			System.out.println(a[k]);
			

			System.out.println("After "+Arrays.toString(a));

			k++;
			

		}

		for (int m = 0; m < a.length; m++) {
			System.out.println("Ind: " + m + " Value : " + a[m]);
		}

	}

}
