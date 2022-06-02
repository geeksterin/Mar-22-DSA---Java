package dsa_collection_queue_2nd_June_2022;

public class MyQueueLL {

	Node head = null;
	Node tail = null;
	
	void add(int data){
		
		Node n = new Node(data);
		
		if(head == null) {
			head = n;
			tail = n;
		}
		
		else {
			tail.next = n;
			tail = n;
		}
		
	}
	
	
	int remove() {
		
		if(head == null) {
			System.out.println("Queue is empty!");
			return -1;
		}
		
		else {
			System.out.println("removing -> "+head.data);
			int temp = head.data;
			
			head = head.next;
			
			return temp;
		}
	}
	
	
	int peek() {
		
		if(head == null) {
			System.out.println("Queue is empty!");
			return -1;
		}
		
		else {
			return head.data;
		}
	}
	
	boolean isEmpty() {
		
		if(head == null) {
			System.out.println("Queue is empty!");
			return true;
		}
		
		else {
			return false;
		}
	}
	
	void display() {
		
		if(head == null) {
			System.out.println("Queue is empty!");
		}
		
		else {
			Node temp = head;
			while(temp!=null)
			{
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}
	

}

 class Node {

	int data;
	Node next;
	
	Node(int data){
		this.data = data;
		this.next = null;
	}
}

