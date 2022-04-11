package dsa_practise_week_arrays_11th_Apr_2022;

import java.util.Arrays;

public class SortNumbersof3s4sand5s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,4,5,3,4,3,4,5,5,5,4,4,3,3,3,4,4,4,5,5,5,3,3};
		
		sort(a);
		
		//a[] = {3,3,3,3,3,3,3,3,3,
		
	}

	private static void sort(int[] arr) {
		
		int a =0; // count of 3
		int b = 0;// count of 4
		int c = 0;// count of 5
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]==3)
			{
				a++;
			}
			
			else if(arr[i]==4)
			{
				b++;
			}
			
			else
			{
				c++;
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//set the values
		for(int i =0;i<a;i++)
		{
			arr[i] = 3;
		}
		
		//set the 4 value in array
		
		for(int i =a;i<(a+b);i++)
		{
			arr[i] = 4;
		}
		
		for(int i = (a+b);i<arr.length;i++)
		{
			arr[i] = 5;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
