package dsa_collection_27th_May_2022;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li1 = new ArrayList<String>();
		li1.add("A");
		li1.add("B");
		li1.add("A");
		li1.add("B");

		List<String> li2 = new ArrayList<String>();
		li2.add("A");

		
		li1.removeAll(li2);

		System.out.println(li1);

		List<String> li3 = new ArrayList<String>();
		li3.add("X");
		li3.add("Y");

		li1.addAll(li3);

		System.out.println(li1);

	}

}
