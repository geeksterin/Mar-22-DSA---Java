package dsa_practise_16th_April_2022;

public class JitendraCode {
	public static void main(String[] args) {
		int i = 0;
		int n = 5;
		String str = " thankyou";
		letsTry(i, n, str);

	}

	private static void letsTry(int i, int n, String str) {
		if (i >= n) {
			return;
		} else {
			System.out.println(str);
			letsTry(++i, n,str);
		}
	}
}
