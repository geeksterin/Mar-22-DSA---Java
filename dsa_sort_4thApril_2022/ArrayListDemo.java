package dsa_sort_4thApril_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,2,4,5,6,8};
		
		//int b[] = new b[8];
		
		List<Integer> list = new ArrayList<>();
		/*
		 * list.add(10); list.add(20); list.add(30);
		 * 
		 * System.out.println(list);
		 * 
		 * list.add(1, 15);
		 * 
		 * System.out.println(list);
		 * 
		 * list.remove(0);
		 * 
		 * System.out.println(list);
		 * 
		 * list.add(30); list.add(20);
		 * 
		 * System.out.println(list);
		 */
		
		List<String> names = new ArrayList();
		
		names.add("Nidhi");
		names.add("Ajay");
		names.add("Sankalp");
		names.add("Gulshan");
		names.add("Ansari");
		names.add("Lalan");
		
		
		/*
		 * boolean found = names.contains("Lalan");
		 * 
		 * 
		 * System.out.println(found); System.out.println(names.get(3));
		 * 
		 * 
		 * List<String> attendance = new ArrayList(); attendance.add("Lalan");
		 * 
		 * //names.removeAll(attendance); System.out.println(names);
		 */
		//System.out.println(names);

		
		//boolean removed = names.remove("Lalan");
		
		String name = names.get(4);
		//System.out.println(name);
		//names.remove(4);
		
		//System.out.println(names);
		
		//System.out.println("List :: "+);
		/*
		 * for(int i=0;i<names.size();i++) { if(names.get(i).startsWith("A")) {
		 * System.out.println(names.get(i));
		 * 
		 * } }
		 */
		
		
		Collections.sort(names);
		
		System.out.println(names);
	}

}
