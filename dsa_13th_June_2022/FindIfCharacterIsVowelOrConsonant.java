package dsa_13th_June_2022;

import java.util.Scanner;

public class FindIfCharacterIsVowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		char ch = s.charAt(0);
		
		
		if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
		{
			if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				System.out.println("Vowel");
			}
			
			else {
				System.out.println("Consonant");
			}
		}
		
		else {
			System.out.println("Invalid input!");
		}
		
	}

}
