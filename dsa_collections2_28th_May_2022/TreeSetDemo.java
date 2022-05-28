package dsa_collections2_28th_May_2022;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> tset = new TreeSet<Integer>();
		tset.add(10);
		tset.add(20);
		tset.add(3);
		tset.add(1);
		tset.add(6);
		
		
		Set<String> tset2 = new TreeSet<String>();
		Set<Integer> tset3 = new TreeSet<Integer>();
		
		tset2.add("gh");
		tset2.add("A");
		tset2.add("fd");
		tset2.add("df");
		tset2.add("Bash");


		
		System.out.println(tset2);
		
		Set<Student> stSet = new TreeSet<Student>();
		stSet.add(new Student(10,"Aga"));
		stSet.add(new Student(22,"sf"));
		stSet.add(new Student(4,"sf"));
		stSet.add(new Student(2,"sf"));

		
		System.out.println(stSet);

		

		
	}

}
