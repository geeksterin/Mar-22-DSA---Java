package dsa_practise_session_3_13th_April_2022;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 1, 0, 1 } };

		boolean b = identity(arr);
		System.out.print(b);

	}

	private static boolean identity(int[][] arr) {
		// TODO Auto-generated method stub

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i + j == 1)
					return true;
			}
		}
		return false;
	}

}
