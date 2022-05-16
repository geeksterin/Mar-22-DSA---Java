package dsa_exception_16th_May_2022;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 30;
		
		try {
		int y = x/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Exception occured.May be its arithmetic exception");
			
			System.out.println("Message : "+e.getMessage());
		}
		
		System.out.println("hello");
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("hi");
		
		
		String s1 = "123sd";
		
		

	}

}
