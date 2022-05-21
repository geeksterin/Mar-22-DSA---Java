package dsa_threads_practise_21_May_2022;

public class MainPriorityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Thread.currentThread().getPriority());
		
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		System.out.println("mythread p "+t1.getPriority());
		
		
		System.out.println(Thread.currentThread().getAllStackTraces());
		
		SleepThread st = new SleepThread();
		st.setName("Sleep Thread");
		st.start();
		System.out.println(Thread.currentThread().getAllStackTraces());

		
	}

}
