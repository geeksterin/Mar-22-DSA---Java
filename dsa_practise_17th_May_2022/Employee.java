package dsa_practise_17th_May_2022;

public class Employee {

	int id;
	
	@Override
	protected void finalize() {
		
		System.out.println("In finalize method()");
		System.out.println("Before garcbage collection the value of id was : "+this.id);
	}
}
