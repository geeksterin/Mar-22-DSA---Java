package dsa_practise_12th_april_2022;

import java.util.Arrays;

public class JitendraCode {
	public static void main(String[] args) {
		int ar[] = { 1, -2, -3, 4, 5, -6, 7, -8, -9, 10 };
		int[] b = new int[ar.length];
		int po = 0;
		int neg = 1;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] >= 0) {
				b[po] = ar[i];
				po = po + 2;
			}
			if (ar[i] < 0) {
				b[neg] = ar[i];
				neg = neg + 2;
			}
		}
		for (int i = 0; i < b.length; i++) {
			ar[i] = b[i];
		}
		
		//System.out.println("a.length : "+ar.length);
		//System.out.println("b.length : "+b.length);

		System.out.print(Arrays.toString(ar));

	}
}
