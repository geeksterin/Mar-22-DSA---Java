package dsa_practise_17th_May_2022;

public class TestThrows {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		m2();
		
		System.out.println("hello");
	}
	
	public static void m2() {
		try {
			m1();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void m1() throws MyException {
		System.out.println("division : "+ 10/2);
		throw new MyException("Customised exception!!!!!!!") ;
	}

}
