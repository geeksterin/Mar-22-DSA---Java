package dsa_practise_16th_April_2022;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		
		int i =1;
		
		int sum =0;
		
		printSum(n,i,sum);
		
		
	}

	private static void printSum(int n, int i, int sum) {
		
		if(i > 10)
		{
			System.out.println("Sum : "+sum);
			return;
		}
		
		else
		{
			sum = sum+i;
			printSum(n,++i,sum);
			
		}
		
	}
	
    private static void printSum(int n, int sum) {
		
		if(n <= 0)
		{
			System.out.println("Sum : "+sum);
			return;
		}
		
		else
		{
			sum = sum+n;
			printSum(n-1,sum);
			
		}
		
	}

}
