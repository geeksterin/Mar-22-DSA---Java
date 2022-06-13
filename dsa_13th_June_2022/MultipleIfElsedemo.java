package dsa_13th_June_2022;

import java.util.Scanner;

public class MultipleIfElsedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>10) {
			System.out.println("Greater than 10");
		}
		
		else {
			if(num>5) {
				System.out.println("Greater than 5");
			}
			
			else {
				System.out.println("Less than 5");
			}
		}
	}

}
