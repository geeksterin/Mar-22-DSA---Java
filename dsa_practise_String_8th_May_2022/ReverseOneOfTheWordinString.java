package dsa_practise_String_8th_May_2022;

public class ReverseOneOfTheWordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String str="Welcome to my world welcome again";
		 
		 String word = "welcome";
		 
		 str = str.toLowerCase();
		 word = word.toLowerCase();
		 
		 
		 String splitArray[] = str.split(" ");

		 String temp = "";
		 for(int i =0;i<splitArray.length;i++) {
			 
			 String b = splitArray[i];
			 if(!b.equals(word)) {
				 temp = temp +b+" ";
				 
			 }
			 
			 else {
				 String rev = reverse(b);
				 temp = temp + rev+" ";
			 }
			 
			 
		 }
		 
		 System.out.println(temp);
		 
	}

	private static String reverse(String b) {
		
		String s = "";
		for(int i =b.length()-1;i>=0;i--)
		{
			s = s+b.charAt(i);
		}
		
		return s;
	}

}
