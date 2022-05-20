package dsa_thread_methods_20th_May_2022;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String name = "C:\\Users\\U6054381\\Documents\\dsademo.txt";
			File f = new File(name);
			
			FileWriter fw = new FileWriter(f);
			
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("testing the write functionaly...");
			br.flush();
			
			br.newLine();
			for(int k =0;k<10;k++)
			{
				br.write("hello "+k);
				br.newLine();
				br.flush();
			}
			br.write("more code");
			br.flush();
			br.close();
			
			fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
