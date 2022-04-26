package dsa_linked_list_25th_April_2022;

public class DeleteNextNodeLinkedList {

	static Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//addFirst(40);
		addFirst(20);
		for(int i =10;i>=1;i--)
		{
			addFirst(i*10);
		}
		
		addFirst(20);
		display();
		
		int data = 20;
		deleteNextNode(data);
		
		display();
		
	}
	
	
	private static void deleteNextNode(int data) {
		
		if(head==null)
		{
			System.out.println("list is empty!");
			return;
		}
		
		else if(head.next == null)
		{
			System.out.println("only one element!");
		}
		
		else {
			
			Node cur = head;
			
			while(cur!=null)
			{
				if(cur.data == data)
				{
					System.out.println("Found the data");
					
					if(cur.next!=null)
					{
						cur.next = cur.next.next;
					}
					
				}
				
				cur = cur.next;
			}
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
