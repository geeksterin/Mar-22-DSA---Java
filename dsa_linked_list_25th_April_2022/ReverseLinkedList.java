package dsa_linked_list_25th_April_2022;

public class ReverseLinkedList {

	static Node head;

	public static void main(String[] args) {

		for(int i =1;i<=5;i++) {
			addFirst(i*10);
		}
		
		display();
		reverse();
		display();
	}

	private static void reverse() {
		
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		
		else if(head.next==null) {
			System.out.println("only one element in the list");
			return;
		}
		
		else {
			//3 variables
			Node prev = null;
			Node cur = head;
			Node next = head;
			
			while(cur!=null) {
				//safeguard next node
				next = cur.next;
				//now good to change the current's next node to previous node
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			head = prev;
			
		}
		
	}

	public static void addFirst(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			// This indicates that the list was empty. So make the newnode as head

			head = newNode;
		}

		// List is not empty
		else {
			newNode.next = head;
			head = newNode;
		}
	}

	public static void display() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		else {
			Node cur = head;

			while (cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}

			System.out.println();
		}

	}

}



