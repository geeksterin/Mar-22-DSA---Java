package dsa_30th_Mar_2022;

public class CircularRoatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {14,24,2,3,4,8};
		
		
		int searchIndex = binarySearch(a);
		System.out.println(searchIndex);
	}

	private static int binarySearch(int[] a) {
		
		int start = 0;
		int end = a.length -1;
		
		if(a[start] <= a[a.length-1])
		{
			System.out.println("No rotations");
			return -1;
		}
			
		while(start<=end)
		{
			
			int mid = start + (end-start)/2;
			
			int prev = (mid == 0)? a.length-1 : mid-1;
			
			int next = (mid == a.length-1)? 0: mid+1;
			
			if(a[mid]<=a[prev] && a[mid]<= a[next])
			{
				return mid;
			}
			
		
			if(a[mid]<=a[a.length-1])
			{
				//search in left
				end = mid -1;
			}
			
			else if(a[mid]>=a[a.length-1])
			{
				//search in right side
				start = mid +1;
			}
		}
		return -1;
		
		
	
	}

	
}
