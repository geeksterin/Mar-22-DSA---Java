package interview_prep_30th_april_2022;

public class A {

	int id;

	int add(int x, int y) {
		System.out.println("add in A");
		return x + y;
	}
	
	int add(int x, int y,int z) {
		System.out.println("add in A");
		return x + y;
	}

	public static void main(String args[]) {
		// B b = new A();
		A a = new B();
		a.add(2, 4);

	}
	
	public String toString() {
		return "thanks for creating object!";
		
	}
	
}


class B extends A {

	int id;

	int add(int x, int y) {
		System.out.println("add in B");
		return x + y;
	}

}
