package dsa_thread_methods_20th_May_2022;

public class OddThread implements Runnable{

	@Override
	public void run() {
		for(int i =0;i<10;i++)
		{
			if(i%2==1)
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
