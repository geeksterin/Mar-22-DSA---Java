package dsa_practise_7th_May_2022;

public class SakshamCode {

	public static void main(String p[]) {

		int a[] = { 1, 2, 3, 4, 9, 8, 7, 6, 5 };

		System.out.println(mountain(a));
	}

	public static boolean mountain(int[] a) {
		int i = 0;
		while (i < a.length) {
			if (a[i] > a[i + 1]) {
				return false;
			}

			else {
				while (i < a.length - 1 && a[i] < a[i + 1]) {
					i++;
				}
				if (i == a.length - 1) {
					return false;
				}
				// move over from peak
				while (a[i] == a[i - 1]) {
					i++;
				}
				i++;
			}
			if (a[i] < a[i + 1]) {
				return false;
			}
			i++;

		}
		return true;
	}
}
