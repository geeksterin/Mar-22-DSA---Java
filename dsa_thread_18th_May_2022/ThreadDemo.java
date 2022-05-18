package dsa_thread_18th_May_2022;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread t1 = new MyThread(); // born/start
		
		t1.setName("Mythread1");
		t1.start();  //ready
		
		
		/*
		 * for(int i =1;i<=1000000;i++) {
		 * System.out.println("name : "+Thread.currentThread().getName()+" i : "+i);
		 * 
		 * if(i%2==0) { try { Thread.sleep(5000); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); } }
		 * 
		 * }
		 */
		
		
	
		
	}

	
}
