package dsa_1st_april_2022_timeComplexity;

public class SumOfNumbersForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = sum(1000000000);
		System.out.println(sum);
	}

	private static double sum(double n) {
		double sum = 0;
		for (double i = 0; i <= n; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
