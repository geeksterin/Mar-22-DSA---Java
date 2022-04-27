package dsa_linked_list_types_of_ll_27th_april_2022;

public class FindMiddleOfLinkedListTwoPointer {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node p1 = new Node(10);
		head = p1;
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(35);
		head.next.next.next.next = new Node(67);
		head.next.next.next.next.next = new Node(39);
		


		display(head);
		
		findMiddle();
		

	}
	
	private static void findMiddle() {
		if(head ==null) {
			System.out.println("List is empty!");
			return;
		}
		
		else if(head.next == null) {
			System.out.println("Only one ele");
			return;
		}
		
		else {
			Node a = head;
			Node b = head;
			
			while(b!=null && b.next!=null)
			{
				a = a.next;
				b = b.next;
				
				if(b!=null && b.next!=null)
				{
					b = b.next;

				}
				
			}
			
			System.out.println("Mid "+a.data);
			
		}
		
	}

	static void display(Node head) {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		} else {
			Node cur = head;
			while (cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}
			System.out.println();
		}
	}

}
