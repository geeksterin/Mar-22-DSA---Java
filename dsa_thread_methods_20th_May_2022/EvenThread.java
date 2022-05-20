package dsa_thread_methods_20th_May_2022;

public class EvenThread implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<1000;i++)
		{
			if(i%2==0)
			{
				System.out.println(Thread.currentThread().getName()+"-"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
