package dsa_recursion_8th_April_2022;

public class HelloWorldRecursiveWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int i = 1;
		
		print(n,i);
	}

	private static void print(int n, int i) {
		
		// You have printed n number of times, so return or come out of the method
		if(i==n)
		{
			System.out.println("Hello World");
			return ;
		}
		
		else
		{
			System.out.println("Hello World");
			 print(n,i++);  //print(5,1)
			 System.out.println(i);
			 
		}
		
	}

}
