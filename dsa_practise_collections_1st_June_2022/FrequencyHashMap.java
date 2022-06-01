package dsa_practise_collections_1st_June_2022;

import java.util.HashMap;
import java.util.Map;

public class FrequencyHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcabcab";
		Map<Character,Integer> map = new HashMap<>();
		
		
		for(int i =0;i<s.length();i++)
		{
			Character ch = s.charAt(i);
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			
			else
			{
				Integer val = map.get(ch); //1
				map.put(ch, val+1);
			}
		}
		
		
		System.out.println(map);
		
	}

}
