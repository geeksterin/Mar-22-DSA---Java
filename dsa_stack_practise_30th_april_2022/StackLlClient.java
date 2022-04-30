package dsa_stack_practise_30th_april_2022;

public class StackLlClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackLL s = new StackLL();
		
		s.push(10);
		s.push(20);
		s.push(30);
		
		s.display();
		
		s.pop();
		s.display();
		
		System.out.println(s.peek());
		s.pop();
		s.display();
		s.pop();
		s.display();
	}

}
