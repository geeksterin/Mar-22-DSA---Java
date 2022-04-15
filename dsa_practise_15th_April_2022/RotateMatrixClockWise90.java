package dsa_practise_15th_April_2022;

import java.util.Arrays;

public class RotateMatrixClockWise90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		

		
		rotate(a);
		rotate(a);
		//System.out.println(Arrays.deepToString(a));
		
		
	}

	private static void swapElements(int[][] a, int m, int n) {
		
		//n-1 -> last column 
		
		for(int i =0;i<m;i++)
		{
			for(int j =0;j<n/2;j++)
			{
				int temp = a[i][j];
				a[i][j] = a[i][n-1-j];
				a[i][n-1-j] = temp;
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
	
	private static void rotate(int[][] a)
	{
		int m = a.length; // NO. OF ROWS
		int n = a[0].length; //NO. OF colms
		
		System.out.println("ORIGINAL");
		print(a, m, n);
		transpose(a, m, n);
		System.out.println("TRANSPOSED");
		print(a, m, n);
		swapElements(a,m,n);
		System.out.println("ROTATED CLOCKWISE");
		print(a, m, n);
	}

}
