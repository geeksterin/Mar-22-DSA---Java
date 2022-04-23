package dsa_linked_list_operations2_23rd_April_2022;

public class NidhiCode {

	static Node1 head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addAtFirst(10);
		//display();
		addAtFirst(50);
		//display();
		addAtFirst(30);
		//display();
		addAtLast(100);
		display();
		getSize();
	}

	private static void getSize() {
		Node1 cur = head;
		int count = 0;
		if (head == null) {
			System.out.print("List is empty");
		} else {
			while (cur != null) {
				count++;
				cur = cur.next;
			}
		}
		System.out.println();
		System.out.println("There are total " + count + " Node1s are presents in the list");
		System.out.println();

	}

	static void addAtFirst(int info) {
		Node1 temp = new Node1();
		temp.data = info;
		if (head == null) {
			head = temp;
			temp.next = null;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	static void addAtLast(int info) {
		Node1 temp = new Node1();
		temp.data = info;
		temp.next = null;
		
		if (head == null) {
			head = temp;

		} else {
			Node1 cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = temp;

		}
	}

	static void display() {
		int count = 0;
		if (head == null) {
			System.out.print("List is empty");
		} else {
			Node1 cur = head;

			/*
			 * while(cur!=null) { if(cur.data>10) { count++; } cur=cur.next;
			 * 
			 * System.out.print("There are "+count+" Node1 whose value greater than 10");
			 * 
			 * }
			 */
			System.out.println();
			while (cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.next;
			}

		}
	}

}
