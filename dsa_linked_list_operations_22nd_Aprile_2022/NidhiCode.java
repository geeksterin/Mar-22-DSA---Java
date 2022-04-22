package dsa_linked_list_operations_22nd_Aprile_2022;

public class NidhiCode {

	public static Node head = null;

	public static void main(String[] args) {
		addAtFirst(10);
		display();
		addAtFirst(50);
		display();
		addAtFirst(30);
		display();

	}

	static void addAtFirst(int info) {
		Node temp = new Node(info);
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	static void display() {
		if (head == null) {
			System.out.print("List is empty");
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
