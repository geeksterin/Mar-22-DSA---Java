package dsa_practise_6th_April_2022;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2};
		int b[] = {2,4};
		
		int c[] = new int[a.length+b.length];
		
		for(int i =0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		
		//System.out.println(Arrays.toString(c));
		
		
		for(int j=0;j<b.length;j++)
		{
			c[a.length+j] = b[j];
		}
		
		//System.out.println(Arrays.toString(c));
		
		Arrays.sort(c);
		
		//System.out.println(Arrays.toString(c));

		
		for(int i =0;i<a.length;i++)
		{
			a[i] = c[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			b[j] = c[a.length+j];
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));


	}

}
