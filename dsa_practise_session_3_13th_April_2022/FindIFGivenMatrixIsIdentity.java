package dsa_practise_session_3_13th_April_2022;

public class FindIFGivenMatrixIsIdentity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		
		int rowsize = arr.length;
		int colsize = arr[0].length;
		
		boolean identity = true;
		
		
		
		for(int i =0;i<rowsize;i++)
		{
			for(int j =0;j<colsize;j++)
			{
				//principal diagonal
				if(i==j)
				{
					if(arr[i][j]!=1)
					{
						identity = false;
						break;
					}
				}
				
				//non diagonal
				else
				{
					if(arr[i][j]!=0)
					{
						identity = false;
						break;
					}
				}
			}
		}
		
		System.out.println("Identity?? "+identity);

	}

}
