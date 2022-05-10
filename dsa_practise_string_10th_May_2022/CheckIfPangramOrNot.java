package dsa_practise_string_10th_May_2022;

public class CheckIfPangramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hequickbrownfoxjumpsoverthelazydovbvbfbvfbdvbfvbsdb";
		
		int temp[] = new int[26];
		
		s = s.toUpperCase();
		
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			int ascii = ch;
			
			//Convert it onto a small value
			
			int x = ascii - 'A';  // if ch = A, 65 -65 = 0
			
			temp[x] = temp[x]+1;
			
		}
		
		for(int i =0;i<temp.length;i++) {
			if(temp[i]==0) {
				System.out.println("false");
				return;
			}
		}
		
		System.out.println("true");
		
	}

}
