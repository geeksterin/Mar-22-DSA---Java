package dsa_recursion_8th_April_2022;

public class PrintPowerOf2Recursievely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		
		int ans = power(n);
		System.out.println(ans);
	}

	private static int power(int n) {
		
		if(n==1)
		{
			return 2;
		}
		
		else
		{
			return (2*power(n-1));
		}
	}

}
