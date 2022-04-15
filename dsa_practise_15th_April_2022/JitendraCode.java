package dsa_practise_15th_April_2022;

public class JitendraCode {

	public static void main(String[] args) {
		int[][] ar = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		int r = ar.length;
		int c = ar[0].length;

		// Transpose
		for (int i = 0; i < r; i++) {
			for (int j = i; j < c; j++) {
				int temp = ar[i][j];
				ar[i][j] = ar[j][i];
				ar[j][i] = temp;
			}
			// System.out.print(ar[i][j]);
		}
		// System.out.println();

		// Swap
		for (int j = 0; j < c; j++)
		{
			for (int i = 0; i < r/2; i++) {
				{
					// System.out.println(ar[i][j]);
					{
						int temp = ar[i][j];
						ar[i][j] = ar[r - 1 - i][j];
						ar[r - 1 - i][j] = temp;

					}

				}
			}
		}
			
		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {
				System.out.print(ar[i][j] + " ");
			}
			System.out.println();

		}
	}
}
