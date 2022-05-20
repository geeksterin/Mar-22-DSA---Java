package dsa_thread_methods_20th_May_2022;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable ot = new OddThread();
		Thread t1 = new Thread(ot);
		t1.setName("Odd");
		
		Runnable ot1 = new EvenThread();
		Thread t2 = new Thread(ot1);
		t2.setName("Even");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
