package dsa_oops_26th_May_2022;

public class Student {
	
	static private Student std;
	
	
	static public Student get() {
		
		if(std==null)
		{
			std = new Student();
		}
		
		return std;
	}
	
	
	private Student() {
		
	}

}
