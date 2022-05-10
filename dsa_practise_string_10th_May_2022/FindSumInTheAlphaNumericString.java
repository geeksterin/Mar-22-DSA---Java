package dsa_practise_string_10th_May_2022;

public class FindSumInTheAlphaNumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "ab123t5678";
		
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);   
			
			if(ch.isDigit(ch)) {
				int x = ch.getNumericValue(ch);
				sum += x;
			}
		}
		
		System.out.println(sum);

	}

}
