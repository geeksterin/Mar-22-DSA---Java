package dsa_practise_6th_May_2022;

import java.util.Arrays;

public class FindtheReverseInthegivenPattern {

	public static void main(String[] args) {

		String s = "i.like.this.program.very.much";
		
		s = s.replace('.', '_');
	
		System.out.println(s);
		
		String[] s2 = s.split("_");
		System.out.println(Arrays.toString(s2));
		
		String temp = "";
		
		for(int k =s2.length-1;k>0;k--)
		{
			temp = temp+s2[k] + ".";
		}
		
		temp = temp+s2[0];
		System.out.println(temp);
		

		
	}

}
