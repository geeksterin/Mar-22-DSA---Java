package dsa_31st_March_2022;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//0 to 9
		int a[] = {0,1,2,3,4,5,6,7,8,9,10,12,13};
		
		int missingNum = findMissingNum(a);
		System.out.println(missingNum);
				
		}

	private static int findMissingNum(int[] a) {
		
		int start = 0;
		int end = a.length-1;
		
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			
			if(mid == 0)
			{
				return mid;
			}
			
			//When to return?
			if(a[mid]!=mid && a[mid-1]==mid-1)
			{
				return mid;
			}
			
			// If you  dont find the item, how to go right
			
			else if(a[mid]==mid)
			{
				start = mid +1;
			}
			//If you  dont find the item, how to go left?
			
			else
			{
				end = mid -1;
			}
		}
		return a.length;
	}
	

}
