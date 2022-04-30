package dsa_stack_practise_30th_april_2022;

public class StackAlClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackAL al = new StackAL();
		al.push(1023);
		al.push(102);
		al.push(675);
		
		//al.display();
		
		al.pop();
		//al.display();
		
		//System.out.println(al.peek());
		al.pop();
		al.pop();
		al.display();
	}

}
