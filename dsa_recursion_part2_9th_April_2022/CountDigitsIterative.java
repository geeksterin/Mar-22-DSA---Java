package dsa_recursion_part2_9th_April_2022;

public class CountDigitsIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 8756411;
	
		int count = 0;
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		
		System.out.println(count);
		
		
	}

}
