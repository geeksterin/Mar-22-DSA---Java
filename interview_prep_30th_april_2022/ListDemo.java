package interview_prep_30th_april_2022;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//find the total marks and percentage obtained by a student in all 6 subjects
		
		//{90,97,86,97,60,89}
		
		float totalMarks = 600;
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(91);
		al.add(97);
		al.add(90);
		al.add(97);
		
		al.add(60);
		al.add(89);
		
		//System.out.println(al);
		
		int finalMarks = 0;
		for(int i =0;i<al.size();i++)
		{
			finalMarks = finalMarks + al.get(i);
			System.out.println(al.get(i));
		}
		
		float percentage = (float) (finalMarks/totalMarks) *100;
		
		System.out.println(finalMarks);
		System.out.println(totalMarks);

		System.out.println(percentage);
		
		//Print the marks if greater than 95

		
		for(int i =0;i<al.size();i++)
		{
			if(al.get(i)>95)
			System.out.println(al.get(i));
		}
		
		
		//Print the index of the list if marks equal to 90
		
		System.out.println(al.contains(90));
		
		System.out.println(al.indexOf(90));
		
		
		
			
	}

}
