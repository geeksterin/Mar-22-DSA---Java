package dsa_practise_12th_april_2022;

import java.util.Arrays;

public class AlternatePositiveNegativeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		
		arrange(a);
		
		System.out.println(Arrays.toString(a));
		
		
		
	}

	private static void arrange(int[] a) {
		//do code here
		int i = 0 ;// positive number index
		int j = 1 ; //negative number index
		
		int b[] = new int[a.length];
		
		for(int k =0;k<a.length-1;k++)
		{
			// positive number
			if(a[k]>=0)
			{
				b[i] = a[k];
				i = i+2;
			}
			
			//negative number
			else
			{
				b[j] = a[k];
				j = j+2;
			}
			
		}
		
		for(int m =0;m<b.length-1;m++)
		{
			a[m] = b[m];
		}
		
	}

}
