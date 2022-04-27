package dsa_linked_list_types_of_ll_27th_april_2022;

public class DoubleLLOperations {

	static DNode head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addFirst(10);
		
		addFirst(20);
		addFirst(20);
		display();

		addLast(40);
		addLast(43);


		display();
	}

	private static void addLast(int data) {
		
		DNode d = new DNode(data);
		if(head == null) {
			return;
		}
		
		else {
			DNode cur = head;
			while(cur.right!=null) {
				cur = cur.right;
			}
			
			cur.right = d;
			d.left = cur;
		}
		
	}

	public static void addFirst(int data) {
		DNode d = new DNode(data);

		if (head == null) {
			head = d;
		}

		else {
			d.right = head;
			head.left = d;
			head = d;
		}

	}

	public static void display() {
		if (head == null) {
			System.out.println("List is empty!");
			return;
		}

		else {
			DNode cur = head;

			while (cur != null) {
				System.out.print(cur.data + " ");
				cur = cur.right;
			}

			System.out.println();
		}

	}

}
