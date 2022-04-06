package dsa_practise_6th_April_2022;

import java.util.Arrays;

public class MergeTwoSortedArraysWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,5,7,9,10,100};
		int b[] = {2,4,6,7,8,91,92,67,90,90};
		
		
		int i = a.length-1;
		int j = 0;
		
		int temp =0;
		
		while(i>=0 && j<b.length)
		{
			if(a[i]>=b[j])
			{
				//swap
				temp = a[i];
				a[i]= b[j];
				a[i] = temp;
				/*
				 * a[i] = a[i]^b[j]; b[j] = a[i]^b[j]; a[i] = a[i]^b[j];
				 */
			}
			
			i--;
			j++;
		}
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
