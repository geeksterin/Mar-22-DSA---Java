package dsa_13th_June_2022;

import java.util.Scanner;

public class FindUpperCaseorLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char ch = s.charAt(0);
		
		int a =ch;
		System.out.println("Char at first place is : "+ch);
		System.out.println("ascii cal : "+a);
		
		if(ch>=65 && ch<=90) {
			System.out.println("Uppercase");
		}
		
		else if(ch>=97 && ch<=122) {
			System.out.println("Lowecase");
		}
		
	}

}
