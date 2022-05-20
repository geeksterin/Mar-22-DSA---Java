package dsa_thread_methods_20th_May_2022;

public class OddEvenThreadTogetherDemo {

	static int num = 0;
	int size = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OddEvenThreadTogetherDemo ob = new OddEvenThreadTogetherDemo();
		
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				ob.even();				
			}
			
		});
		
		
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				ob.odd();				
			}
			
		});
		
		t2.setName("Odd");
		t1.setName("Even");
		t1.start();
		t2.start();
				
	}
	
	protected void odd() {
		
		synchronized(this)
		{
			while(true)
			{
				while(num<size)
				{
				if(num%2==0) {
					try {
						System.out.println(Thread.currentThread().getName()+ " - waiting");
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				System.out.println(Thread.currentThread().getName()+" - "+num);
				num++;
				notify();
			}
			}
		}
		
			
		
	}

	private void even() {
		
			synchronized(this) {
				
				while(true) {
					while(num<size) {

					
					if(num%2==1)
					{
						try {
							System.out.println(Thread.currentThread().getName()+ " - waiting");

							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
					System.out.println(Thread.currentThread().getName()+" - "+num);
					num++;
					notify();
					}
				}
			}
		
		
	}

}
