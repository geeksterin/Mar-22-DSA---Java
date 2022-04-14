package dsa_practise_14th_April_2022;

import java.util.Arrays;

public class AjayJadhaoCode {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{13,14,15,16} };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (i >j) {
					arr[i][j] = 0;
				}
			}
			System.out.println();

		}
		System.out.println(Arrays.deepToString(arr));

	}

}
