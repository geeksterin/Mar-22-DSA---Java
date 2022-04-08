package dsa_recursion_8th_April_2022;

public class PrintEvenNumberWithOneVariableRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		printEven(n);
	}

	private static void printEven(int n) {
		
		if(n==0)
		{
			System.out.println(n);
			return;
		}
		
		else
		{
			System.out.println(n);
			printEven(n-2);

		}
		
	}

}
