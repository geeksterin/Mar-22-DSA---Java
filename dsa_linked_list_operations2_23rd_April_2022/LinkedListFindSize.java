package dsa_linked_list_operations2_23rd_April_2022;

public class LinkedListFindSize {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addFirst(10);

		addFirst(20);
		addFirst(30);

		display();

		System.out.println(getSize());
		// deleteFirst();
		display();

		deleteLast();
		display();
		deleteLast();

		display();
		deleteLast();
		display();

	}

	private static void deleteLast() {

		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		// only one lement
		else if (head.next == null) {
			head = null;
			return;
		}

		else {
			Node prev = head;
			Node cur = head.next;

			while (cur.next != null) {
				cur = cur.next;
				prev = prev.next; // second last element
			}

			prev.next = null;
		}

	}

	private static void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		else {
			head = head.next;
		}

	}

	private static int getSize() {
		int count = 0;

		// list is empty check
		if (head == null) {
			return count;
		}

		else {
			Node cur = head;

			while (cur != null) {
				count++;
				cur = cur.next;
			}

			return count;
		}
	}

	// addFirst()
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
