package dsa_practise_16th_April_2022;

public class PrintOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		
		if(n%2==0)
		{
			n = n+1;
		}
		print(n);
		
	}

	private static void print(int n) {
		
		if(n < 1)
		{
			return;
		}
		
		else
		{
			print(n-2);
			System.out.println(n);

		}
		
		
	}

}
