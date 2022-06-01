package dsa_practise_collections_1st_June_2022;

import java.util.HashMap;
import java.util.Map;

public class FindPangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Quick zephyrs blow, vexing daft Jim.";
		str = str.toLowerCase();
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i =0;i<str.length();i++)
		{
			Character ch = str.charAt(i);
			
			if(map.get(ch)==null)
			{
				map.put(ch,1);
			}
			
			else {
				Integer val = map.get(ch);
				map.put(ch, val+1);
			}
		}
		
		System.out.println(map);
		
		int counter = 0;
		for(char c='a';c<='z';c++)
		{
			//System.out.println(c);
			if(map.get(c)!=null && map.get(c)>=1)
			{
				counter++;
			}
		}
		
		if(counter == 26)
		{
			System.out.println("Pangram");
		}
		
		else {
			System.out.println("Not Pangram!");
		}
		
	}

}
