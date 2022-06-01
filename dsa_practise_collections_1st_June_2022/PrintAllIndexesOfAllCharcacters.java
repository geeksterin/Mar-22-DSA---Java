package dsa_practise_collections_1st_June_2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAllIndexesOfAllCharcacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character,ArrayList<Integer>> map = new HashMap<>();
		
		String s = "Hello world";
		
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			
			if(map.get(ch)==null)
			{
				ArrayList<Integer> list = new ArrayList<>();
				list.add(i);
				
				map.put(ch,list);
			}
			
			else
			{
				ArrayList<Integer> list = map.get(ch);
				list.add(i);
				
				map.put(ch, list);
			}
		}
		
		System.out.println(map);
		
		
	}

}
