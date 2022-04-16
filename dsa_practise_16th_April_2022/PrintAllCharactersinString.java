package dsa_practise_16th_April_2022;

public class PrintAllCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Welcome";
		
		int i = 0;
		print(s,i);
	}

	private static void print(String s, int i) {
		
		if(i >= s.length() -1)
		{
			return;
		}
		
		else
		{

			System.out.println(s.charAt(i));
			print(s,++i);

			
			
		}
		
	}

}
