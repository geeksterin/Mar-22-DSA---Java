package dsa_recursion_part2_9th_April_2022;


public class AjayJadhaoCode {

	public static void main(String[] args) {
		int n = 12345;
		int count = 0;
		int countNum =reverse(n,count);
		System.out.println(countNum);

	}

	private static int reverse(int n, int count) {
		
		if(n==0) {	
			//System.out.println("count : "+count);
			return count;
			
		}
		else {
			count++;
			//System.out.println(count);
			
			return reverse (n / 10,count);
		}
		
	}

}