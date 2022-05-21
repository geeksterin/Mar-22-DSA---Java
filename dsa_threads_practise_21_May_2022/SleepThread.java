package dsa_threads_practise_21_May_2022;

public class SleepThread extends Thread{

	public  void run() {
	
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("hello");
		}
	}

}
