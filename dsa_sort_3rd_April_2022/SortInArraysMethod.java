package dsa_sort_3rd_April_2022;

import java.util.Arrays;

public class SortInArraysMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {12,3,2,12,45,1,56};
		
		System.out.println("Before sort : "+Arrays.toString(a));

		//Arrays.sort(a);
		Arrays.sort(a,1,4);
		
		System.out.println("After sort : "+Arrays.toString(a));
	}

}
