package dsa_practise_4th_June_2022;

public class FindTheReverseOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "This is a session";
		
		String split[] = s1.split(" ");
		
		String rev = "";
		
		for(int i =split.length-1;i>=0;i--) {
			String str = split[i];
			
			/*
			 * String temp = ""; for(int j =str.length()-1;j>=0;j--) { temp =
			 * temp+str.charAt(j)+""; }
			 */
			rev = rev+str+" ";
		}
		
		System.out.println(rev);
		
		
	}

}
