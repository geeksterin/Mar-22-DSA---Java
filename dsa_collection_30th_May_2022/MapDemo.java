package dsa_collection_30th_May_2022;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map1 = new HashMap<>();
		map1.put("India", "New Delhi");
		map1.put("Australia","Canberra");
		map1.put("Russia","Moscow");
		map1.put("India", "Pune");

		System.out.println(map1);
		
		
		System.out.println(map1.get("Australia"));
		System.out.println(map1.get("India"));
		
		
		

	}

}
