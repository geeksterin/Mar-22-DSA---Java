package dsa_practise_session_3_13th_April_2022;

public class PrintPrincipalDiagonalMatrix {

	public static void main(String args[]) {
		int[][] arr = { { 1, 2, 3 }, { 4, 3, 2 }, { 9, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				//System.out.println(arr[i][j] + " ");
				if (i == j) {
					System.out.println(arr[i][j] + " ");
				}
			}
		}
		System.out.println();

	}

}
