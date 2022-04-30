package interview_prep_30th_april_2022;


import java.util.ArrayList;
import java.util.List;

public class RakeshCode {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList();
		al.add(90);
		al.add(97);
		al.add(86);
		al.add(97);
		al.add(60);
		al.add(89);
		System.out.print(al);
		for (int i = 0; i < al.size(); i++)
		{
			if (al.get(i) > 95) {
				System.out.println(al.get(i));
			}
		}
			
	}
}
