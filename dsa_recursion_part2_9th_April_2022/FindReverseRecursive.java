package dsa_recursion_part2_9th_April_2022;

public class FindReverseRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 12123;

		findRev(n);

	}

	private static void findRev(int n) {

		if (n == 0) {
			return;
		} else {
			System.out.print(n % 10);
			findRev(n / 10);
		}

		/*
		 * if(n<10) { System.out.println(n); return; } System.out.print(n%10);
		 * findRev(n/10);
		 */
	}

}
