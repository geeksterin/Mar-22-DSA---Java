package dsa_linked_list_operations_22nd_Aprile_2022;

public class LinkedListDemo {

	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("head value : "+head);
		
		  addFirst(5); 
		  //display();
		  
		System.out.println("head value : "+head.data);
		
		addFirst(10); 
		  //display();
		
		addFirst(20);
		
		display();
		
		System.out.println("Count ->"+getCount());
		
		addLast(50);
		display();
	
	}
	
	//addFirst()
	public static void addFirst(int data) {
		
		Node newNode = new Node(data);
		if(head == null) {
			//This indicates that the list was empty. So make the newnode as head
			
			head = newNode;
		}
		
		//List is not empty
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	
	//addLast()
	
	//display
	
	public static void display() {
		if( head == null)
		{
			System.out.println("List is empty!");
			return;
		}
		
		else {
			Node cur = head;
			
			while(cur!=null) {
				System.out.print(cur.data+" ");
				cur = cur.next;
			}
			
			System.out.println();
		}
		
	}
	
	
	public static int getCount() {
		int count = 0;
		
		if(head == null) {
			return 0;
		}
		
		else {
			
			Node cur = head;
			while(cur!=null) {
				if(cur.data > 10) {
					count++;
				}
				cur = cur.next;
			}
			
			return count;
		}
		
	}
	
	
	public static void addLast(int data) {
		Node newNode = new Node(data);
		
		//if list is empty?
		if(head == null) {
			head = newNode;
		}
		else {
			Node cur = head;
			while(cur.next!=null) {
				cur = cur.next;
			}
			
			cur.next = newNode;
		}
	}

}


