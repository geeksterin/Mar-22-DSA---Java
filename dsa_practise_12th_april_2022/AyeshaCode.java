package dsa_practise_12th_april_2022;

import java.util.Arrays;

public class AyeshaCode {

	public static void main(String[] args) {
		int[] a = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };
		int[] b = new int[a.length];
		int pos = 0;
		int neg = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				b[pos] = a[i];
				pos = pos + 2;
			}

			else {
				b[neg] = a[i];
				neg = neg + 2;
			}
		}
		for (int m = 0; m < b.length; m++) {
			a[m] = b[m];
		}
		System.out.println(Arrays.toString(b));
	}
}
