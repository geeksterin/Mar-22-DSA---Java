package dsa_7th_april_2022;

public class SearchIn2DLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		int num = 100;
		
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a[0].length;j++)
			{
				if(a[i][j]== num)
				{
					System.out.println("Found at Index : "+i+","+j);
					return;
				}
			}
		}

	}

}
