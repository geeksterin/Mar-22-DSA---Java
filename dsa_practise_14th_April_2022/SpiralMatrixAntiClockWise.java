package dsa_practise_14th_April_2022;

public class SpiralMatrixAntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{13,14,15,16} };

		printSpiralAntiClockWise(a);
	}

	private static void printSpiralAntiClockWise(int[][] a) {
		
		int rowSize = a.length;
		int colSize = a[0].length;
		
		int top = 0;
		int bottom = rowSize-1;
		int left = 0;
		int right = colSize -1;
		
		int dir = 1;
		
		while(top <=bottom && left<=right)
		{
			
			//dir1
			//Top row
			//print all elements from right column to left column
			if(dir == 1)
			{
				for(int i = right;i>=left;i--)
				{
					System.out.print(a[top][i] + " ");
				}
				
				top ++;
				dir = 2;
				
			}
			
			//dir2
			
			//left column
			//print elements from top to bottom
			if(dir == 2)
			{
				for(int i =top ;i<=bottom;i++)
				{
					System.out.print(a[i][left]+" ");
				}
				
				left ++;
				dir = 3;
			}
			
			
			//dir3
			
			//bottom row
			//print elements from left to right
			if(dir == 3)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(a[bottom][i]+ " ");

				}
				
				bottom --;
				dir = 4;
			}
			
			//dir4
			//right column
			//print elments from bottom to top
			if(dir == 4)
			{
				for(int i=bottom ;i >= top;i--)
				{
					System.out.print(a[i][right]+" ");
				}
				
				right --;
				dir = 1;
			}
			
		}
		
		
	}

}
