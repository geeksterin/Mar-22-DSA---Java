package dsa_oops_24th_May_2022;

public class NidhiCode {
	public static void main(String args[]) {
		String batchName = "java batch";
		Student5 s1 = new Student5(1, "nidhi", batchName);
		s1.display();
	}
}

class Student5 {
	
	static {
		System.out.println("Inside static block...");
	}
	
	
	int id;
	String name;
	static String batchName;

	Student5(int id, String name, String batchName) {
		System.out.println("in constructor of student");
		this.id = id;
		this.name = name;
		this.batchName = batchName;
	}

	  void display() {
		System.out
				.println("Student id: " + id + " " + "Student name: " + name + " " + "student batchName: " + batchName);
	}
}
