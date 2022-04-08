package dsa_recursion_8th_April_2022;

public class AmanCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 2, num2;

		num2 = 20;

		print(num1, num2);
	}

	private static int print(int num1, int num2) {
		if (num2 < num1)
			return 0;
		System.out.print(num1 + " ");
		return print(num1 + 2, num2);
	}
}
