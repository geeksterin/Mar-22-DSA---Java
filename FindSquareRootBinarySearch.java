package search_28thMar2022;

public class FindSquareRootBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 8;
		
		int sqrt = findSqrt(num);
		System.out.println(sqrt);
		
		System.out.println(Math.sqrt(num));
	}

	private static int findSqrt(int num) {
		
		int start = 0;
		int end = num;
		
		int ans = 0;
		
		while(start<=end)
		{
			int mid = (start +end)/2;
			
			if(mid *mid == num)
			{
				return mid;
			}
			
			//right
			else if (num >mid *mid)
			{
				start = mid +1;
				ans = mid;
			}
			
			else
			{
				end = mid -1;
			}
		}
		
		return ans;
	}

}
