package dsa_string_practise_12th_May_2022;

import java.util.Scanner;

public class HariCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		String s2 = "";
		s2 = s2 + s.charAt(s.length() - 1);
		for (int i = 0; i <= s.length() - 2; i++) {
			s2 = s2 + s.charAt(i);
		}
		if (s1.equals(s2) == true) {
			System.out.println("true");
		}
		
		System.out.println("s2 - >"+s2);
		System.out.println("false");

	}
}
