package dsa_collection_27th_May_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l1 = new ArrayList<>();
		
		l1.add("Pune");
		l1.add("Hyderabad");
		l1.add("Mumbai");
		l1.add("Delhi");
		l1.add("Delhi");
		l1.add("Banagalore");
		l1.add("Mumbai");
		
		for(int i =0;i<l1.size();i++)
		{
			System.out.println(l1.get(i)); //a[i]
			
		}
		
		
		for(String str : l1)
		{
			System.out.println(str);
		}

		System.out.println(l1);
		
		Student s1 = new Student();
		System.out.println(s1);
		
		int x = Collections.frequency(l1, "Delhi");
		System.out.println(x);

		
		
	}

}
