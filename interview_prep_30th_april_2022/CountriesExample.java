package interview_prep_30th_april_2022;

import java.util.ArrayList;
import java.util.List;

public class CountriesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> al = new ArrayList();

		al.add("India");
		al.add("Japan");
		al.add("iraq");
		al.add("Iran");
		al.add("Italy");
		al.add("Australia");
		al.add("America");
		al.add("United Kingdom");
		
		List<String> temp1 = new ArrayList();
		temp1.addAll(al);
		

		// enhanced for loop

		for (String s : al) // al.get(0), al.get(1).... , al.get(size-1)
		{
			String temp = s.toUpperCase();
			if (temp.startsWith("I"))
				System.out.println(s);
		}

		// contains only 4 characters remove from the list
		for (int i = 0; i < al.size(); i++) {

			if (al.get(i).length() == 4) {
				System.out.println("i :"+i);
				
				temp1.remove(al.get(i));

			}

		}
		
		al.clear();
		al.addAll(temp1);
		
		System.out.println("Original : "+al);
		
		System.out.println("temp1 :"+temp1);


		System.out.println("------------");
		
		/*
		 * for(String s:al) { if (s.length() == 4) { System.out.println(s);
		 * //al.remove(al.get(i)); } }
		 */

		System.out.println(al);

	}

}
