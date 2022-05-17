package dsa_practise_17th_May_2022;

public class ReturnValueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int val = m1();
		System.out.println();
	}

	private static int m1() {
		// TODO Auto-generated method stub
		
		try {
			
			return 3;
		}
		catch(Exception e) {
			return 4;
		}
		finally {
			return 5;
		}
	}

	
}
