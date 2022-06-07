package dsa_practise_6th_June_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f1 = new File("test.txt");
		
		/*
		 * try { BufferedReader br = new BufferedReader(new FileReader(f1)); } catch
		 * (FileNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		
		
		for(int i =1;i<=10000;i++) {
			System.out.println(i);

			if(i%100==0) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
