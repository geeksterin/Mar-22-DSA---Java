package dsa_oops_26th_May_2022;

public class Employee {

	 static private Employee emp;
	
	 static public Employee get(){
		
		 if(emp == null)
		 {
			emp = new Employee();
		 }
		
		return emp;
	}
	
	private Employee(){
		
	}
}
