package dsa_practise_6th_June_2022;

public class MyThread implements Runnable{

	int start;
	int end;
	
	@Override
	public void run() {
		for(int i =start;i<=end;i++) {
			System.out.println(Thread.currentThread().getName()+" ::: "+i);
		}
		
	}

}
