package dsa_practise_15th_April_2022;

public class RotateBy180Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

		rotateBy180(a);
		
	}

	private static void rotateBy180(int[][] a) {
		
		int m = a.length;
		int n = a[0].length;
		
		int k = m/2;
		k = k+1;
		System.out.println("m/2 +1:: "+k);
		for(int i =0;i<m;i++)
		{
			System.out.println("i -->"+i);
			for(int j =0;j<n;j++)
			{
				if(i<=m/2)
				{
					System.out.println("print test -> "+a[n-1-i][n-1-j]);
					int temp = a[i][j];
					a[i][j] = a[n-1-i][n-1-j];
					a[n-1-i][n-1-j] = temp;
				}
				
			}
		}
		
		print(a,m,n);
	}
	
	
	private static void print(int[][] a, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----------------------------");
	}

}
