package dsa_13th_June_2022;

import java.util.Scanner;

public class MultipleIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num%3==0) {
			if(num *num > 50)
			{
				System.out.println("matched");
			}
		}
		
		else {
			System.out.println("not matched");
		}
	}

}
