package dsa_exception_16th_May_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f = new File("C://Users//a.txt");
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			try {
				br.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*
		 * InputStream i = new InputStream() {
		 * 
		 * @Override public int read() throws IOException { // TODO Auto-generated
		 * method stub return 0; } };
		 * 
		 * try { i.read(); } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}

}
