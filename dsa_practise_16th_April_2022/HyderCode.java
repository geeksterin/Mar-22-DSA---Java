package dsa_practise_16th_April_2022;

public class HyderCode {

	public static void main(String[] args) {

		String msg = "Welcome to session";
		int i = 5;
		int count = 0;
		print(i, count, msg);
	}

	private static void print(int i, int count, String msg) {
		if (i == count) {
			return;

		} else {
			System.out.println(msg);
			print(i, count + 1, msg);
		}
	}
}
