package search_29th_March_2022;

public class InfiniteArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 89;
		
		int index = findNumber(num);
		System.out.println("Index  found :: "+index);
	}

	private static int findNumber(int num) {
		
		int start = 0;
		int end = 1;
		
		while(end<=num)
		{
			System.out.println("end :: "+end);
			end = 2*end;
		}
		
		System.out.println("End :: "+end);
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			
			if(mid == num)
			{
				return mid;
			}
			
			//right
			else if (mid < num)
			{
				start = mid +1;
			}
			
			else
			{
				end = mid -1;
			}
		}
		
		return -1;
	}

}
