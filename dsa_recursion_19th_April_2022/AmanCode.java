package dsa_recursion_19th_April_2022;

import java.util.Scanner;

public class AmanCode {

	public static void main(String[] args) {
		int i, number, c = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a = 1;
		int b = 1;

		for (i = 0; i < n; i++) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a + b;
		}

	}
}
