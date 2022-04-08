package dsa_recursion_8th_April_2022;

public class HyderCode {

	public static void main(String[] args) {
	
		int n = 1;  // Number of times?
		int i = n;
		print(n, i);

	}
	

	private static void print(int i, int n) {
		if (i == n) {
			System.out.println("hello world");
			return;
		} else {
			i++;
			System.out.println("hello world");

			print(n, i);
		}
	}
}
