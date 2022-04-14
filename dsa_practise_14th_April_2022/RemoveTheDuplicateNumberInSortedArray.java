package dsa_practise_14th_April_2022;

import java.util.Arrays;

public class RemoveTheDuplicateNumberInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[] = { 0, 0, 1, 1, 2, 3, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 10 };
		
		int a[] = {-19,-1,0, 1, 1, 2, 2, 3, 4, 4, 4, 4,5,6, 7, 7, 7, 7};

		int left = 0;
		int right = a.length - 1;
		System.out.println("Initial -> "+Arrays.toString(a));

		while (left < right) {
			if (a[left] != a[left + 1]) {
				left++;
			}

			else if (a[right] == a[right - 1]) {
				right--;
			}
			
			else if(a[left]==a[left+1] && a[right]!=a[right-1])
			{
				//swap
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				
				right --;
				left++;
			}
		}
		
		System.out.println("After unique elements in left "+Arrays.toString(a));
		System.out.println("right position : "+right);
		
		Arrays.sort(a,0,right+1);
		System.out.println("Sorted : "+Arrays.toString(a));

		
	}

}
