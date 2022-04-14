package dsa_practise_14th_April_2022;

public class JitendraCode {
	public static void main(String[] args) {
		int ar[][] = { { 12, 23, 34, 45 }, { 52, 63, 74, 85 }, { 92, 10, 11, 12 }, { 13, 14, 15, 16 } };
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[0].length; j++) {
				if (i == 0 || j == 0 || i == ar.length - 1 || j == ar[0].length - 1) {
					System.out.print(ar[i][j] + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}
