package dsa_oops_24th_May_2022;


public class Student {
	
	int sId;
	String name;
	static String b;
	
	Student(int id,String s){
		this.sId=id;
		this.name=s;
	}

	void display() {
		System.out.println(" Id is "+sId+" "+" Name is"+name+" Branch "+b);
	}

	public static void main(String[] args) {
		Student s1= new Student(1,"Ajay");
		s1.b = "dsa";
		s1.display();
	}
	
	
	
}
