package dsa_30th_Mar_2022;

public class SolveMissingNumberProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0 to 9
		int a[] = { 0, 1, 2, 3, 4, 6, 7, 8, 9 };

		// sum = All elements from 0 to 9 = 50

		// 48
		int sum = 0;
		int arraySum = 0;
		for (int i = 0; i <= 9; i++) {
			sum = sum + i;
			
			if(i < 9)
			{
				arraySum = arraySum + a[i];
			}
		}

		

		/*
		 * for (int j = 0; j < a.length; j++) { arraySum = arraySum + a[j]; }
		 */

		System.out.println(sum);
		System.out.println(arraySum);
		System.out.println(sum-arraySum);

	}

}
