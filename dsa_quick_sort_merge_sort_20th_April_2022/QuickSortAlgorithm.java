package dsa_quick_sort_merge_sort_20th_April_2022;

import java.util.Arrays;

public class QuickSortAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {6,3,1,4,5,1,3,7,0,2,4};
		
		int start = 0;
		int end = a.length-1;
		
		System.out.println("Before sort : "+Arrays.toString(a));
		quickSort(a,start,end);
		System.out.println("After sort : "+Arrays.toString(a));

		
	}

	private static void quickSort(int[] a, int start, int end) {
		
		if(start > end)
		{
			return;
		}
		
		else
		{
			//divide
			int pI = partition(a,start,end);
			
			//left array
			quickSort(a,start,pI-1);
			
			//right array
			quickSort(a,pI+1,end);
		}
		
	}

	private static int partition(int[] a, int start, int end) {
		
		int pivot = end;
		
		int pI = start; //PI -> what is the index where the partition has to happen?
		
		for(int j =start;j<end;j++)
		{
			//Now check if the jth element is smaller or equal to pivot
			if(a[j] <= a[pivot])
			{
				//Swap between j and PI
				int temp = a[j];
				a[j] = a[pI];
				a[pI] = temp;
				
				pI++;
			}
		}
		
		//at PI index, now place the pivot element.
		//Swap pI and pivot
		
		int temp = a[pI];
		a[pI] = a[pivot];
		a[pivot] = temp;
		
		return pI;
		
	}

}
