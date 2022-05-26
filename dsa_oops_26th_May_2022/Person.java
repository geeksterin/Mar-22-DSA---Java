package dsa_oops_26th_May_2022;

import java.util.Comparator;

public class Person implements Comparator<Person>{

	int id;
	String name;
	
	@Override
	public int compare(Person o1, Person o2) {
		
		if(o1.id>o2.id)
		{
			return 1;
		}
		
		else if(o1.id < o2.id) {
			return -1;
		}
		
		else {
			return 0;
		}
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	
	
	
	
}
