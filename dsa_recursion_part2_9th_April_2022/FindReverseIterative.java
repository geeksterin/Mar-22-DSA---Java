package dsa_recursion_part2_9th_April_2022;

public class FindReverseIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12345;
		int digit = 0;
		
		while(n!=0)
		{
			digit = n%10;
			n = n/10;
			
			System.out.print(digit);
		}
		
	}

}
