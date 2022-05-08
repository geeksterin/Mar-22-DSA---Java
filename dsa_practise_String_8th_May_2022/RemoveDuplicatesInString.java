package dsa_practise_String_8th_May_2022;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to my worldgrAHKK";
		s = s.toLowerCase();
		System.out.println(s);
		
		String temp = "";
		
		for(int i =0;i<s.length();i++) {
			//System.out.println(s.charAt(i));
			
			/*if(temp.contains(s.charAt(i)+"")){
				
				//Already present. Dont do anything
			}*/
			
			/*
			 * else { //character not present in the temp, so add it temp = temp +
			 * s.charAt(i); }
			 */
			
			if(!temp.contains(s.charAt(i)+"")) {
				temp = temp+s.charAt(i);
			}
		}
		
		
		
		System.out.println(temp);
		
	}

}
