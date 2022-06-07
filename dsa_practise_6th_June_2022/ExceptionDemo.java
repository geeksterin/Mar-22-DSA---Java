package dsa_practise_6th_June_2022;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(m1());

		//System.out.println(m2());
	}

	/*
	 * private static int m2() {
	 * 
	 * int x = 10; x++;
	 * 
	 * x = 20; return x;
	 * 
	 * }
	 */

	private static int m1() {

		try {
			 int x = 10 / 0;
			System.out.println("hi");

			return 1;
		} catch (Exception e) {
			System.out.println("in catch");

			return 2;
		}

		/*
		 * finally { System.out.println("finally"); return 3; }
		 */

	}

}
