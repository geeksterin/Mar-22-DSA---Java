package dsa_practise_14th_April_2022;

public class SearchInASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{13,14,15,16} };

		int target = 0;
		boolean found = searchMatrix(arr,target);
		System.out.println("Element found? "+found);
		
	}

	private static boolean searchMatrix(int[][] arr, int target) {
		
		int i = 0;
		int j = arr[0].length-1;
		
		
		//Check if target is same as last element in the first row
		
		while(i<arr.length && j>=0)
		{
			//System.out.println("Hello!!");
			if(target == arr[i][j])
			{
				System.out.println("Found -> "+i+","+j);
				return true;
			}
			
			else if(target > arr[i][j])
			{
				i++;
			}
			
			else
			{
				j--;
			}
		}
		return false;
		
	}

}
