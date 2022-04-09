package dsa_recursion_part2_9th_April_2022;

public class AjayBCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12349;

		System.out.println(print(n));
	}

	private static int print(int n) {
		if (n < 10) {

			return 1;

		}

		else {
			n = n % 10;
			print(n / 10);
		}
		System.out.println("n:"+n);
		return n;

	}
}
