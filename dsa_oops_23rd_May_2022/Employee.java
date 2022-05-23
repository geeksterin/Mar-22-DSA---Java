package dsa_oops_23rd_May_2022;

public class Employee {

	int id;
	String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	Employee(){
		System.out.println("in default constructor..");
	}
	
	Employee(int id, String name){
		//this.id = id;
		//this.name = name;
	}
}
