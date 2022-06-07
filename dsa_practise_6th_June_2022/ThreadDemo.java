package dsa_practise_6th_June_2022;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread m1 = new MyThread();
		Thread t1 = new Thread(m1); //  1 to 1000
		m1.start =1;
		m1.end = 1000;
		
		
		MyThread m2 = new MyThread();
		Thread t2 = new Thread(m2); // 1001 to 2000
		
		m2.start =1001;
		m2.end = 2000;
		
		t1.start(); // ready
		
		t2.start();
	}

}
