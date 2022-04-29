package dsa_stack_practise_29th_April_2022;

public class StringSumIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ayub349jk78";
		int sum = 0;

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			if (ch >= '0' && ch <= '9') {

				System.out.println(ch);
				// sum += ch - '0';
				sum += Integer.parseInt(s1.charAt(i) + "");

			}

		}
		System.out.println("sum : " + sum);

		sum = 23;
		int len = s1.length();

		float fsum = sum;
		float flen = len;
		int val2 = Math.round(fsum / flen);

		System.out.println("Val2 : " + val2);

		int val = sum / len;

		int rem = sum % len;

		System.out.println("rem : " + rem);

		if (2 * rem >= len) {
			val = val + 1;
		}

		System.out.println("len : " + len);
		System.out.println("val : " + val);

	}

}
