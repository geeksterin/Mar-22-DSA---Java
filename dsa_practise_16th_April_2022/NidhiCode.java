package dsa_practise_16th_April_2022;

public class NidhiCode {

	public static void main(String[] args) {
		int n = 50;
		PrintNum1ToN(n);

	}

	private static void PrintNum1ToN(int n) {
		if (n == 0) {
			return;
		} else {
			PrintNum1ToN(n-2);
			System.out.print(n + " ");
		}

	}

}
