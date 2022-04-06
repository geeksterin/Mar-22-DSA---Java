package dsa_practise_6th_April_2022;

public class SumOfDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1,2,3},{4,5,6},{7,8,9}};
		
		int sum =0;
		//row
		for(int i =0;i<a.length;i++)
		{
			//column
			for(int j =0;j<a.length;j++)
			{
				if(i==j)
				{
					sum = sum + a[i][j];
					//System.out.println(a[i][j]);
				}
			}
			
			//System.out.println();
		}
		
		System.out.println(sum);
	}

}
