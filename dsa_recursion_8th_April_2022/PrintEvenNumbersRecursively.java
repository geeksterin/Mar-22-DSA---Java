package dsa_recursion_8th_April_2022;

public class PrintEvenNumbersRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 20;
		int i = 2;
		
		printEven(n,i);
	}

	private static void printEven(int n, int i) {
		
		//base condition - return from recursion
		if(i==n)
		{
			System.out.println(i);
			return;
		}
		// call recursive method with increment/decremnt logic
		
		else
		{
			System.out.println(i);
			printEven(n,i+2);
		}
	}

}
