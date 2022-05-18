package dsa_thread_18th_May_2022;

public class MyThread extends Thread{
	
	public void run() {
		
		for(int i =1;i<=1000000;i++)
		{
			System.out.println("name : "+Thread.currentThread().getName()+" i : "+i);
			
			if(i%2==0) {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
