package dsa_practise_16th_April_2022;

public class SagarCode {
	public static void main(String args[]) {
		int i = 1;
		reccursion(i);
	}

	public static void reccursion(int i) {
		if (i > 10) {
			return;
		} else {
			System.out.println(i);
			++i;
			reccursion(i);
		}
	}
}
