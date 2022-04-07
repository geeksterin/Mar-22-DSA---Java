package dsa_7th_april_2022;

public class PrintSpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
		printSpiral(a);
	}

	private static void printSpiral(int[][] a) {
		
		int rowSize = a.length;
		int colSize = a[0].length;
		
		int top = 0; // top row
		int bottom = rowSize -1; // last row
		
		int left = 0 ;// first column
		int right = colSize -1;
		
		int dir = 1;
		// Dir1 -> Dir 2-> Dir3-> Di4 -> Dir1->Dir2->Dir3->Dir4
		while(top<=bottom && left<=right)
		{
			if(dir ==1)
			{
				//print top row
				
				for(int i =left;i<=right;i++)
				{
					//row number is always constant, only column varies
					System.out.print(a[top][i]+ " ");
				}
				
				top++;
				dir = 2;
			}
			
			else if(dir ==2)
			{
				//print right column
				for(int i =top;i<=bottom;i++)
				{
					System.out.print(a[i][right]+ " ");
				}
				
				right --;
				
				dir = 3;
			}
			
			else if(dir ==3)
			{
				//print bottom row
				for(int i = right;i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				
				bottom --;
				dir = 4;
			}
			
			else if(dir == 4)
			{
				// Print left column
				
				for(int i =bottom;i>=top;i--)
				{
					System.out.print(a[i][left]+ " ");
				}
				
				left++;
				dir = 1;
			}
				
			
		}
		
	}

}
