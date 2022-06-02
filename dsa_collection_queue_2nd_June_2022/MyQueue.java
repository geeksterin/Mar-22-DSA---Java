package dsa_collection_queue_2nd_June_2022;

public class MyQueue {

	int rear = -1;
	int size = 10;
	int a[] = new int[size];
	
	//O(1)
	void add(int data)
	{
		if(rear>=size-1) {
			System.out.println("Queue full");
			return;
		}
		else
		{
			//rear++;
			a[++rear] = data;
		}
	}
	
	
	//O(n)
	int remove() {
		if(rear == -1) {
			System.out.println("Queue empty!");
			return -1;
		}
		
		else {
			int temp = a[0];
			
			for(int i=0;i<rear;i++) {
				a[i] = a[i+1];
			}
			
			rear--;
			
			return temp;
		}
	}
	
	int peek() {
		if(rear == -1) {
			System.out.println("Queue empty!");
			return -1;
		}
		
		else {
			return a[0];
		}
	}
	
	boolean isEmpty() {
		if(rear == -1) {
			System.out.println("Queue empty!");
			return true;
		}
		
		return false;
	}
	
	void display() {
		for(int i =0;i<=rear;i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
	}
}
