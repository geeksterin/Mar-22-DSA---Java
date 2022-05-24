package dsa_oops_24th_May_2022;

public class Employee {
	int id;
	String name;
	
	/*
	 * @Override public String toString() { return "Employee [id=" + id + ", name="
	 * + name + "]"; }
	 */
	
	public String toString() {
		return "Employee id -> "+id+" Employee name -> "+name;
	}

	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
}
