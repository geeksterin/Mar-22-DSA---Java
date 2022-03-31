package dsa_31st_March_2022;

public class FindTheFirstOccurenceOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,1,2,2,2,2,3,4,4,4,5,6,6};
		
		int target = 89;
		int firstOccurence = findFirstOccurance(a,target);
		System.out.println(firstOccurence);
	}

	public static int findFirstOccurance(int[] a, int target) {
		int start = 0;
		int end = a.length-1;
		
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			
			System.out.println("start :"+start+", mid : "+mid+", end : "+end);
			
			if(mid == 0 && a[mid]== target)
			{
				return mid;
			}
			
			if(mid == 0 && a[mid]!=target)
			{
				return -1;
			}
			
			//When to return?
			if(a[mid]== target && a[mid-1]<target)
			{
				return mid;
			}
			
			// If you  dont find the item, how to go left
			
			else if(target <= a[mid])
			{
				end = mid -1;
			}
			//If you  dont find the item, how to go right?
			
			else
			{
				start = mid + 1;
			}
		}
		return -1;
	}
	

}
