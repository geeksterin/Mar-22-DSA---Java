package dsa_exception_16th_May_2022;

public class NullPointerExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s = null;
			int x = s.indexOf('A');
		}

		catch (ArithmeticException ex) {
			System.out.println("Message - > exception occured!");
		} 
		
		catch (RuntimeException ex) {
			System.out.println("Message - > exception occured!");
		}

		catch (Exception e) {
			System.out.println("Message - > exception occured!");
		}

		System.out.println("Hi");
	}

}
