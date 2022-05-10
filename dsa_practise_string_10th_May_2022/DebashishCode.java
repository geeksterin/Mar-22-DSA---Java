package dsa_practise_string_10th_May_2022;

public class DebashishCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "";
		boolean bool = checkIfPangram(s);
		System.out.println(bool);
	}

	private static boolean checkIfPangram(String s) {
		  for(char i='a';i<='z';i++) {
				if(!s.toLowerCase().contains(String.valueOf(i))) {
					return false;
				}
			}
			return true;

	}
	
	

}
