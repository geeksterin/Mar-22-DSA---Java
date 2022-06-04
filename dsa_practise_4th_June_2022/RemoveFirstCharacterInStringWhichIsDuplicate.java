package dsa_practise_4th_June_2022;

public class RemoveFirstCharacterInStringWhichIsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Akash";
		
		s = s.toLowerCase();
		
		char ch = findFirstDup(s);
		int ind = s.indexOf(ch);
		
		System.out.println(ind);
		String t = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(i!=ind)
			{
				t = t+s.charAt(i)+"";
			}
		}
				
		
		System.out.println(t);
	}
	
	public static char findFirstDup(String s)
	{
		String t = "";

		for(int i =0;i<s.length();i++)
		{
			if(t.contains(s.charAt(i)+"")){
				System.out.println("Duplicate found : "+s.charAt(i)+"");
				return s.charAt(i);
			}
			
			else {
				t = t+s.charAt(i);
			}
		}
		
		return '0';
	}

}
