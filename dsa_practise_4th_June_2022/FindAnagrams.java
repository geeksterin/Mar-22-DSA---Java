package dsa_practise_4th_June_2022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FindAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "madam";
		String s2 = "mabam";
		
		boolean angram = true;

		
		if(s1.length()!=s2.length())
		{
			angram = false;
		}
		Map<Character, Integer> map1 = addToMap(s1);
		Map<Character, Integer> map2 = addToMap(s2);
		
		
		System.out.println(map1);
		
		System.out.println(map2);

		Iterator<Character> itr = map1.keySet().iterator();
		
		
		while(itr.hasNext())
		{
			Character ch = itr.next();
			if(!(map1.get(ch) == map2.get(ch)))
			{
				angram = false;
				break;
			}
		}
		
		System.out.println(angram);
	
	}

	private static Map<Character, Integer> addToMap(String s1) {
		
		Map<Character, Integer> map1 = new HashMap<>();
		
		for(int i =0;i<s1.length();i++) {
			
			if(map1.get(s1.charAt(i))== null)
			{
				map1.put(s1.charAt(i), 1);
			}
			
			else {
				int val = map1.get(s1.charAt(i));
				map1.put(s1.charAt(i), val+1);

			}
			
		}
		return map1;
		
	}

}
