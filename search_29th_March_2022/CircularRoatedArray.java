package search_29th_March_2022;

public class CircularRoatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,34,2,5,7,8};
		
		int searchIndex = binarySearch(a);
		System.out.println(searchIndex);
	}

	private static int binarySearch(int[] a) {
		
		int start = 0;
		int end = a.length -1;
		
		
		while(start<=end)
		{
			//int mid = (start + end)/2;
			
			int mid = start + (end-start)/2;
			
			int prev = computePrev(mid,a);
			
					
			int next = computeNext(mid,a);
			if(a[mid] )
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

	private static int computeNext(int mid, int[] a) {
		// TODO Auto-generated method stub
		
		if(mid == a.length-1)
		return mid;
	}

	private static int computePrev(int mid, int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

}
