package dsa_queue_3rd_June_2022;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 PriorityQueue<Integer> pq1 = new PriorityQueue<>();

		pq1.add(5);
		pq1.add(2);
		pq1.add(1);
		pq1.add(15);

		System.out.println("peek " + pq1.peek());

		System.out.println(pq1.remove());

		System.out.println("peek " + pq1.peek());

		PriorityQueue<Employee> pq = new PriorityQueue<>();
		pq.add(new Employee(1, "A", 10000.f));
		pq.add(new Employee(2, "B", 11000.f));
		pq.add(new Employee(3, "C", 3000.f));

		System.out.println(pq.peek());
		
		
		 PriorityQueue<InterviewCandidate> pq2 = new PriorityQueue<>();
		 pq2.add(new InterviewCandidate(1, "A", "non-referral"));
		 pq2.add(new InterviewCandidate(2, "B", "referral"));
		 pq2.add(new InterviewCandidate(3, "C", "non-referral"));
		 pq2.add(new InterviewCandidate(4, "D", "referral"));
		 
		 System.out.println("---------");
		 System.out.println(pq2);
		 
		 //System.out.println(pq2.peek());



	}

}
