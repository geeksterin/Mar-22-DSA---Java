package dsa_practise_16th_April_2022;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int sum = 0;
		int n = 3;

		print(sum, n);

	}

	private static void print(int sum, int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			System.out.println(sum);
			return;
		}

		sum += n;
		print(sum, n - 1);

	}
}
