package dsa_practise_12th_april_2022;

import java.util.Arrays;

public class NidhiCode {
	public static void main(String args[]) {
		int x[] = { 1, 2, 3, 4, 5 };
		int first = x[0];
		int i = 1;
		while (i <= x.length-1) {
			x[i - 1] = x[i];
			i++;
			
			//System.out.println("i : "+i);

			//System.out.println(Arrays.toString(x));
		}
		System.out.println("i : "+i);
		x[x.length-1] = first;
		for (int j = 0; j < x.length; j++) {
			System.out.print(x[j] + " ");
		}

	}
}
