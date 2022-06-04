package dsa_practise_4th_June_2022;

import java.util.Scanner;

public class DeepakGupthasCode {
	
	static String removeDup(String s) {
	      
	       int i;
	       int j;
	       String rdup = "";
	       
	       for (i = 0; i< s.length(); i++) 
	       {
	           int count = 1;
	           
	           for (j = 0; j < rdup.length(); j++) 
	           {
	        	   
	               if (s.charAt(i) == s.charAt(j))
	               {
	                    count++;
	                    
	               }
	           }
	           if (count == 1)
	           {
	               rdup += s.charAt(i);
	               }
	           } 
	           System.out.print("val : "+rdup);
	           System.out.println();
	           return rdup;
	       }

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		
	    String s;

	            System.out.print("Enter string:");
	            s = in.nextLine();
	            removeDup(s);
	            in.close();
	}
}
