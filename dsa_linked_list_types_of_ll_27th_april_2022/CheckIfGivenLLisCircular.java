package dsa_linked_list_types_of_ll_27th_april_2022;

public class CheckIfGivenLLisCircular {

	static Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);

		Node last = head.next.next;

		last.next = head;

		boolean bool = findIfCircular();
		System.out.println(bool);
	}

	private static boolean findIfCircular() {

		boolean found = false;

		if (head == null) {
			return found;
		}

		else if (head.next == null) {
			return found;

		} else {
			Node cur = head;

			while (cur != null && cur.next!=null) {
				cur = cur.next;

				if (cur.next == head) {
					found = true;
					break;
				}
			}
		}

		return found;
	}

}
