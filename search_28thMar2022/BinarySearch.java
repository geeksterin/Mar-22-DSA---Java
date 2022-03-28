package search_28thMar2022;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,7,8,12,34,56,78,90};
		int s = 99;
		
		int searchIndex = binary(a,s);
		System.out.println(searchIndex);
	}

	private static int binarySearch(int[] a, int s) {
		
		int start = 0;
		int end = a.length -1;
		
		
		while(start<=end)
		{
			int mid = (start + end)/2;
			
			if(a[mid] == s)
			{
				return mid;
			}
			
			
			// search right of mid
			if(s > a[mid])
			{
				start = mid +1;
			}
			
			// search left of mid
			else if( s < a[mid])
			{
				end = mid - 1;
			}
		}
		return -1;
		
		
	}
	
	public static int binary(int[] arr,int value) {
		/*
		 * best=O(1)
		 * worst=O(logn)
		 */
		int a=0;
		int z=arr.length-1;
		while(a<=z) {
		int m=(a+z)/2;
		if(arr[m]==value) {
			return m;
		}
		if(value>arr[m]) {
			a=m+1;
		}
		else
			z=m-1;
		}
		return -1;
	}


}
