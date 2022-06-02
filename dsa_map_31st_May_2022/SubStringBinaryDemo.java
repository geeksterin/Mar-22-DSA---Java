package dsa_map_31st_May_2022;

public class SubStringBinaryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "10100000101";
		
		for(int i =0;i<s.length();i++)
		{
			String str = "";
			for(int j =i;j<s.length();j++)
			{
				str = str +s.charAt(j);
				
				//System.out.println(str);
				//System.out.println("---------");
				
				boolean bool = equal0and1(str);
				if(bool)
				{
					System.out.println(str);
					System.out.println("-------");
				}
			}
		}
		
		
		
		
		
	}

	private static boolean equal0and1(String str) {
		
		int a = 0;
		int b = 1;
		
		if(str.length()%2==1)
		{
			return false;
		}
		
		else {
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i) == 0)
				{
					a++;
				}
				else if(str.charAt(i) == 1)
				{
					b++;
				}
			}
			
			
			if(a==b)
			{
				return true;
			}
		}
		return false;
		
	}

}
