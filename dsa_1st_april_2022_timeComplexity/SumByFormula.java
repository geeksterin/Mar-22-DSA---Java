package dsa_1st_april_2022_timeComplexity;

public class SumByFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = sumFormula(1000000000);
		System.out.println(sum);
	}

	private static double sumFormula(double n) {
		double sum = (n *(n+1))/2;
		return sum;
	}

}


