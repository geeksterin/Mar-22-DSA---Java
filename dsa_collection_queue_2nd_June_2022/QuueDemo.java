package dsa_collection_queue_2nd_June_2022;

import java.util.Queue;

public class QuueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		MyQueue mq = new MyQueue();
		mq.size = 3;
		
		mq.add(10);
		mq.add(20);
		mq.add(30);
		mq.add(40);
		
		mq.display();
		
		System.out.println("Peek --> "+mq.peek());
		
		mq.remove();
		mq.display();
		
		mq.remove();
		mq.display();
		mq.remove();
		mq.display();	
		mq.remove();
		
		mq.remove();
		mq.display();
		mq.display();


		
	}

}
