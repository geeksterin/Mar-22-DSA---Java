package dsa_collections2_28th_May_2022;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("B");
		
		//System.out.println(set);
		
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext())
		{
			String s = iterator.next();
			System.out.println(s);
		}
		
		
		
	}

}
