package dsa_practise_7th_May_2022;

import java.util.Arrays;

public class SumOfArrayExceptItself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 6, 4, 8, 9 };

		int sum[] = new int[a.length];

		int s = 0;
		for (int i = 0; i < a.length; i++) {
			s += a[i];
		}
		
		for(int i =0;i<a.length;i++) {
			sum[i] = s -a[i];
		}
		
		System.out.println(Arrays.toString(sum));
		
	}

}
