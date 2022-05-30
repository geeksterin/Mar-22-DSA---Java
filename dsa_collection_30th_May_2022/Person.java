package dsa_collection_30th_May_2022;

public class Person implements Comparable<Person>{
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Person o) {
		if(this.id > o.id) {
			return +1;
		}
		
		else if(this.id<o.id) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
