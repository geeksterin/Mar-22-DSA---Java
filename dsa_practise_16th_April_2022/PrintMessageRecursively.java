package dsa_practise_16th_April_2022;

public class PrintMessageRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		int i = 1;
		
		String msg = "Welcome to session!";
		//print(i,n);
		
		printNew(n,msg);
		
	}

	private static void print(int i, int n) {
		
		if(i>n)
		{
			return;
		}
		
		else
		{
			System.out.println("Hello World!");
			print(++i,n);
		}
		
	}
	
   private static void printNew(int n,String msg) {
		
		if(n==0)
		{
			return;
		}
		
		else
		{
			printNew(n-1, msg);
			System.out.println(msg);
			
		}
		
	}

}
