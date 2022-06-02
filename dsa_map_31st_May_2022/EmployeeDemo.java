package dsa_map_31st_May_2022;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Employee e1 = new Employee(); //System.out.println(e1);
		 * 
		 * String s1 = "Japan"; // System.out.println(s1.hashCode());
		 * 
		 * System.out.println(s1.hashCode());
		 * 
		 * System.out.println(s1.hashCode() & 15);
		 */
		
		
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("India","New Delhi");
		map.put("Japan","Tokyo");
		map.put("Russia","Moscow");
		
		/*Map<Integer,String> map1 = new HashMap<Integer, String>();
		
		map1.put(1,"New Delhi");
		map1.put(1,"Tokyo");
		map1.put(4,"Moscow");*/
		
		
		Set<String> set1 = map.keySet();
		
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext())
		{
			String str = itr.next();
			System.out.println(str);
			//System.out.println("Hashcode -> "+str.hashCode());
			//System.out.println("Bucket -> "+(str.hashCode() & 15));
			
			String val = map.get(str);
			System.out.println(val);
			System.out.println("---------------");

		}

		
		
		

	}

}
