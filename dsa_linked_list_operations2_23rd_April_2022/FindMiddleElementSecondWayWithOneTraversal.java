package dsa_linked_list_operations2_23rd_April_2022;

public class FindMiddleElementSecondWayWithOneTraversal {

	static Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1;i<=8;i++)
		{
			addFirst(i*10);
		}
		
		display();
		
		findMiddleElement();
		
	}
	
	private static void findMiddleElement() {
		
		if(head == null) {
			System.out.println("List is empty!");
			return;
		}
		else {
			
			Node a = head;
			Node b = head;
			
			while(a.next!=null)
			{
				a = a.next;
				
				if(a.next!=null)
				{
					b = b.next;
					a = a.next;
				}
				
			}
			
			System.out.println("Middle element : "+b.data);
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
