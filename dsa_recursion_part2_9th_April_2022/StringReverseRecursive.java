package dsa_recursion_part2_9th_April_2022;

public class StringReverseRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";  //5 -1 = 4  -> 0,1,2,3
		
		reverse(s1);
		
	}

	private static void reverse(String s1) {
		//hello
		//hell
		//hel
		//he
		//h
		if(s1!=null && s1.length() == 0)
		{
			return;
		}
		
		else
		{
			System.out.println(s1.charAt(s1.length()-1));
			
			reverse(s1.substring(0, s1.length()-1));
		}
	}

}
