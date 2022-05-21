package dsa_threads_practise_21_May_2022;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> aList = new ArrayList<String>();
		aList.add("name : Vidya");
		aList.add("College : JSS");
		aList.add("Technology : Java/Angular");
		aList.add("City : Bangalore");
		aList.add("Trained at Geekster");
		
		List<String> bList = new ArrayList<String>();
		bList.add("name : Divya");
		bList.add("College : JSS");
		bList.add("Technology : Java/React");
		aList.add("City : Delhi");
		bList.add("Trained at Geekster");
		
		List<String> cList = new ArrayList<String>();
		cList.add("name : Darshan");
		cList.add("College : JSS");
		cList.add("Technology : HTML/CSS");
		aList.add("City : Pune");
		cList.add("Trained at Other Training school");
		
		
		MyThread r = new MyThread();
		Thread t1 = new Thread(r);
		r.myList = aList;
		t1.setName("Alist");
		
		MyThread r1 = new MyThread();
		Thread t2 = new Thread(r1);
		r1.myList = bList;
		t2.setName("Blist");

		
		MyThread r3 = new MyThread();
		Thread t3 = new Thread(r3);
		r3.myList = cList;
		t3.setName("Clist");
		
		t1.start();
		
	
		/*
		 * t2.start(); t3.start();
		 */
	}

}
