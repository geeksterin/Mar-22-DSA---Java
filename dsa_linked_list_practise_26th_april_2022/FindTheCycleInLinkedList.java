package dsa_linked_list_practise_26th_april_2022;

public class FindTheCycleInLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		Node last = head.next.next.next;
		
		last.next = head.next;
		
		boolean foundCycle = findCycle(head);
		System.out.println(foundCycle);
		
	}

	private static boolean findCycle(Node head) {
		
		boolean found = false;
		
		if(head==null) {
			return found;
		}
		
		if(head.next==null)
		{
			return found;
		}
		
		else {
			
			Node slowP = head;
			Node fastP = head;
			
			while(fastP!=null && fastP.next.next!=null) {
				
				fastP = fastP.next;
				
				if(fastP.next!=null) {
					fastP = fastP.next;
					slowP = slowP.next;
				}
				
				if(slowP == fastP)
				{
					found = true;
					break;
				}
				
			}
		}
		return found;
	}

}
