package dsa_practise_15th_April_2022;

public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int m = a.length;
		int n = a[0].length;

		transpose(a, m, n);
		print(a, m, n);

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

	}

}
