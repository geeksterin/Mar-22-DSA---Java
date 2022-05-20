package dsa_thread_methods_20th_May_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String name = "C:\\Users\\U6054381\\Documents\\dsademo.txt";
			
			File file = new File(name);
			FileReader fr = new FileReader(file);
			
			BufferedReader br = new BufferedReader(fr);
			
			String line = "";
			
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}
