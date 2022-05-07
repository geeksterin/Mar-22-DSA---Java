package dsa_practise_7th_May_2022;

public class CheckIfMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 4,4, 3, 2, 1 };

		boolean mountainCheck = checkIfMountain(a);
		System.out.println(mountainCheck);

	}

	private static boolean checkIfMountain(int[] a) {

		int peak = -1;

		for (int i = 1; i < a.length; i++) {

			/*
			 * if (a[i - 1] >= a[i]) { peak = i;
			 * System.out.println("Array is in increasing order till here"); break; }
			 */

			if (a[i] > a[i - 1]) {
				continue;
			}

			else {
				peak = i;
				break;
			}

		}

		System.out.println("peak :: " + peak);
		if (peak == a.length - 1 || peak == 1 || peak == -1) {
			return false;
		}

		for (int i = peak; i < a.length; i++) {
			if (a[i - 1] < a[i]) {
				return false;
			}
		}

		return true;
	}

}
