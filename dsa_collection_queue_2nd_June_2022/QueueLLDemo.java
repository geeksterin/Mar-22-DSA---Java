package dsa_collection_queue_2nd_June_2022;

public class QueueLLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueueLL q1 = new MyQueueLL();
		q1.add(10);
		
		q1.display();
		
		q1.remove();
		q1.display();
		
		q1.remove();
		
		q1.add(20);
		q1.add(30);
		q1.add(40);
		
		q1.display();
		
		System.out.println(q1.peek());


		
		
	}

}
