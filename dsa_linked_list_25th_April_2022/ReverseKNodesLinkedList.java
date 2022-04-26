package dsa_linked_list_25th_April_2022;

public class ReverseKNodesLinkedList {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 8; i++) {
			addFirst(i * 10);
		}

		display();
		int k = 3;
		reverse(k);
		display();
	}

	private static void reverse(int k) {

		int count = 0;
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		else if (head.next == null) {
			return;
		}

		else {
			Node cur = head;
			Node prev = null;
			Node next = head;

			while (cur != null && count < k) {
				count++;
				next = cur.next;
				cur.next = prev;
				prev = cur;
				cur = next;
			}
			
			head.next = cur;
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
