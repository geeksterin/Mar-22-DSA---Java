package dsa_practise_4th_June_2022;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "madam";
		
		int i = 0;
		int j = s.length() -1;
		System.out.println("j's length : "+j);
		
		boolean palindrome = true;
		
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				
			}
			
			else {
				palindrome  = false;
				break;
			}
			
			i++;
			j--;
		}
		
		System.out.println("palindrome ?? "+palindrome);
	}

}
