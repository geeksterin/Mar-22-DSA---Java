package dsa_collection_30th_May_2022;

import java.util.HashMap;
import java.util.Map;

public class FindTheFrequencyOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hellololol";

		Map<Character, Integer> map1 = new HashMap<>();
		
		for(int i =0;i<s.length();i++)
		{
			Character ch = s.charAt(i);
			if(map1.get(ch)==null)
			{
				map1.put(ch, 1);
			}
			
			else
			{
			Integer currentCount = map1.get(ch);
			  map1.put(ch, currentCount+1);
			}
		}
		
		System.out.println(map1);

	}

}
