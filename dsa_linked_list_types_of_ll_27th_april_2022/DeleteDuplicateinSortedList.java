package dsa_linked_list_types_of_ll_27th_april_2022;

public class DeleteDuplicateinSortedList {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		head = new Node(10);
		head.next = new Node(10);
		head.next.next = new Node(20);
		head.next.next.next = new Node(20);

		display();
		
		deleteDup();
		display();
	}

	private static void deleteDup() {
		// TODO Auto-generated method stub
		Node cur = head.next;
		Node prev = head;

		while (cur != null) {

			if (prev.data != cur.data) {
				prev = prev.next;
				cur = cur.next;
			}

			else {

				cur = cur.next;
				prev.next = cur;
			}

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
