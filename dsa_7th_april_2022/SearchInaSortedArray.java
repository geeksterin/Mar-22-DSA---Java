package dsa_7th_april_2022;

public class SearchInaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {35,45,55,65},
				  {40,50,60,70},
				  {52,54,62,73},
				  {57,58,64,75} };
		
		int target = 750;
		search(a,target);
	}

	private static void search(int[][] a, int target) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = a[0].length-1;
		
		
		while(i<a.length && j>=0)
		{
			if(a[i][j]==target)
			{
				System.out.println("Found : "+i+","+j);
				return;
			}
			
			// search in same column
			else if(target> a[i][j])
			{
				i++;
			}
			
			//search in same row
			else
			{
				j--;
			}
		}
		
	}

}
