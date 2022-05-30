package dsa_collection_30th_May_2022;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ClientTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Person> set = new TreeSet<Person>();
		
		Person p1 = new Person(10,"Naveen");
		Person p2 = new Person(7,"Prakash");
		Person p3 = new Person(3,"Pooja");
		Person p4 = new Person(17,"Sparsh");

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		
	//	System.out.println(set);



		
		Iterator<Person> iter = set.iterator();
		
		while(iter.hasNext())
		{
			Person pers = iter.next();
			System.out.println(pers);
		}
		
		

		
		
	}

}
