package dsa_recursion_part2_9th_April_2022;

public class StringReverseIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(s1.length()-1));
		
		System.out.println(s1.substring(0, 5));  //0,1,2,3,4  , 5
		
		for(int i =s1.length()-1;i>=0;i--)
		{
			System.out.print(s1.charAt(i));
		}
		
	}

}
