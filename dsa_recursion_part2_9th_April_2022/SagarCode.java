package dsa_recursion_part2_9th_April_2022;

public class SagarCode {
	public static void main(String args[]) {
		String n = "sagar";
		int count = 0;
		
		System.out.println(n.substring(5,0));
		
	//	print(n, count);

	}

	public static void print(String n, int count) {

		if (count == n.length()) {
			System.out.println(n.substring(count, 0));
			// return count;
		} else {
			//
			System.out.println(count);

			print(n, count + 1);
		}
	}
}
