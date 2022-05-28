package dsa_collections2_28th_May_2022;

public class Student implements Comparable<Student> {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {

		/*
		 * if (this.name > o.name) { return 1; }
		 * 
		 * else if (this.id < o.id) { return -1; }
		 * 
		 * else { return 0; }
		 */
		
		return this.name.compareTo(o.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	

}
