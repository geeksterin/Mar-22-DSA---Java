package dsa_threads_practise_21_May_2022;

public class SumThread extends Thread{
	
	String s;
	
	public void run() {
		
		int sum = 0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(Character.isDigit(ch))
			{				
				int actualVal = ch - '0';
				sum = sum + actualVal;
			}
		}
		
		System.out.println(sum);
	}

}
