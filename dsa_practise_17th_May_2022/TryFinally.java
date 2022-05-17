package dsa_practise_17th_May_2022;

import java.io.IOException;
import java.sql.Connection;

public class TryFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			try {
				System.out.println(10/0);
				System.out.println("hello");
			}
			catch(Exception e)
			{
				System.out.println("in catch");
			}
			
			System.out.println(13/0);

		}
		catch(Exception e)
		{
			System.out.println("in outer catch");
		}
		finally {
			System.out.println("in finally...");
		}
		
	}

}
