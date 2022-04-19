package dsa_recursion_19th_April_2022;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int a = 0, b = 1;
		int next = 0;
		int i = 1;
		int m = nFibbonachiSeries(n, a, b, next, i);
		System.out.println(m);

	}

	private static int nFibbonachiSeries(int n, int a, int b, int next, int i) {
		// TODO Auto-generated method stub

		if (n == 1)
			return 0;

		if (n == 2)
			return 1;

		if (i >3 && i<=n) {

			next = a + b;
			a = b;
			b = next;
			return nFibbonachiSeries(n, a, b, next, ++i);

			
		}

		


	}

}
