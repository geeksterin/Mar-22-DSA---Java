package dsa_recursion_19th_April_2022;

public class NthFobonacciIterative {

	public static void main(String[] args) {
		
		int n = 5;
		int val = fibonacci(n);
		System.out.println(val);

	}

	private static int fibonacci(int n) {
	
		int fib1 = 0;
		int fib2 = 1;
		int sum = 0;
		
		if(n==1)
		{
			return 0;
		}
		
		if(n ==2)
		{
			return 1;
		}
		
		for(int i=3;i<=n;i++)
		{
			sum = fib1+fib2;
			fib1 = fib2;
			fib2 = sum;
		}
		
		return sum;
	}

}
