package dsa_linked_list_practise_26th_april_2022;

public class MergeTwoSortedLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head1 = new Node(10);
		head1.next = new Node(15);
		head1.next.next = new Node(20);
		head1.next.next.next = new Node(30);

		display(head1);

		Node head2 = new Node(5);
		head2.next = new Node(10);
		head2.next.next = new Node(10);
		head2.next.next.next = new Node(40);

		display(head2);
		
		Node mergedhead = merge(head1,head2);
		
		
		display(mergedhead);

	}

	private static Node merge(Node head1, Node head2) {
		
		Node head3 = new Node(-1);
		Node p3 = head3;
		
		Node p1 = head1;
		Node p2 = head2;
		
		while(p1!=null && p2!=null) {
			
			if(p1.data <= p2.data)
			{
				p3.next = p1;
				p1 = p1.next;
			}
			
			else
			{
				p3.next = p2;
				p2 = p2.next;
			}
			
			p3 = p3.next;
		}
		
		//second list is completed
		while(p1!=null)
		{
			p3.next = p1;
			p1 = p1.next;
			p3 = p3.next;
		}
		
		
		//first list is completed
		while(p2!=null) {
			p3.next = p2;
			p2 = p2.next;
			p3 = p3.next;
		}
		
		return head3.next;
	}

	public static void display(Node head) {
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
