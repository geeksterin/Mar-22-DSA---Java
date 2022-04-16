package dsa_practise_16th_April_2022;

public class PrintNumbersRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		printNum(n);
	}

	private static void printNum(int n) {

		if (n == 0) {
			return;
		}

		else {
			System.out.println(n);

			printNum(n-1);

		}

	}

}
