package dsa_linked_list_operations2_23rd_April_2022;

public class FindTheMiddleElement {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addFirst(10);
		addFirst(20);
		addFirst(30);
		//addFirst(40);

		display();

		System.out.println(getSize());

		int mid = (getSize()/2) + 1;

		System.out.println("Mid : " + mid);
		// findMiddle(mid);
		getNodeElement(mid);
	}

	private static void findMiddle(int mid) {

		int i = 1;
		if (head == null) {
			System.out.println("empty!");
			return;
		}

		else {
			Node cur = head;
			Node temp = null;

			while (cur.next != null && i < mid) {
				System.out.println("cur -> " + cur.data);
				cur = cur.next;
			}

			System.out.println(cur.data);

			// System.out.println("Middle element : "+temp.data);

		}

	}

	public static void getNodeElement(int num) {
		int count = 1;
		Node target = null;
		if (head == null) {
			System.out.println("List is empty!");
			return;
		} else {
			Node cur = head;
			while (cur != null && count <= num) {
				count++;
				target = cur;
				cur = cur.next;
			}

			System.out.println("Data found : " + target.data);
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

}
