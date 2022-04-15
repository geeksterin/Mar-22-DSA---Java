
package dsa_practise_15th_April_2022;

import java.util.Arrays;

public class RotateAntiClockWise90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int m = a.length; // NO. OF ROWS
		int n = a[0].length; // NO. OF colms

		System.out.println("ORIGINAL");
		print(a, m, n);
		transpose(a, m, n);
		System.out.println("TRANSPOSED");
		print(a, m, n);
		swapElements(a, m, n);
		System.out.println("ROTATED CLOCKWISE");
		print(a, m, n);

		System.out.println(Arrays.deepToString(a));

	}

	private static void swapElements(int[][] a, int m, int n) {
		
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<m/2;i++)
			{
				int temp = a[i][j];
				a[i][j] = a[n-1-i][j];
				a[n-1-i][j] = temp;
			}
		}

	}

	private static void transpose(int[][] a, int m, int n) {

		for (int i = 0; i < m; i++) {
			for (int j = i; j < n; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;

			}

		}

	}

	private static void print(int[][] a, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");
	}

}
