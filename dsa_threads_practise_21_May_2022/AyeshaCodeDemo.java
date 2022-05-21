package dsa_threads_practise_21_May_2022;

import java.util.ArrayList;
import java.util.List;

public class AyeshaCodeDemo {

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
		
		
		AyeshaThreadClass r=new AyeshaThreadClass();
			Thread t1=new Thread( r);
			t1.setName("AList");
			r.mylist=aList;
			
			AyeshaThreadClass r1=new AyeshaThreadClass();
			Thread t2=new Thread( r1);
			t2.setName("AList");
			r1.mylist=bList;


			AyeshaThreadClass r3=new AyeshaThreadClass();
			Thread t3=new Thread((Runnable) r3);
			t3.setName("AList");
			r3.mylist=cList;

			t1.start();
			t2.start();
			t3.start();

	}

}
