package dsa_queue_3rd_June_2022;

public class Employee implements Comparable<Employee>{

	Integer id;
	String name;
	Float sal;
	
	public Employee(int id, String name, float sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.sal.compareTo(o.sal);
		
		
	};
	
	
	
}
