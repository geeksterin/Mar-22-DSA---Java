package dsa_linked_list_operations2_23rd_April_2022;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcdabc";
		
		
		//output -> 4 -> count of unique a,b,c,d
		
		String s2 = "";
		
		for(int i =0;i<s1.length();i++) {
			if(!s2.contains(s1.charAt(i)+"")) {
				
				s2 = s2 + s1.charAt(i);
			}
		}
		
		System.out.println(s2);
		System.out.println(s2.length());
		
		
		
		
	}

}
