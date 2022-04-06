package dsa_practise_6th_April_2022;

public class SumOfSecondaryDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1,2,3},{4,5,6},{90,8,9}};
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if((i+j == a.length-1))
				//if((j==a[i].length-1 && i==0 )||(i==a.length-1 &&j==0)||(i==j && i!=0 && j!=a[i].length-1))
				{
					sum = sum +a[i][j];
					//System.out.println("Diagonal : "+a[i][j]);
				}
			}
		}
		
		System.out.println(sum);
	}

}
