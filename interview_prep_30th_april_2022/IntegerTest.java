package interview_prep_30th_april_2022;

import java.util.ArrayList;
import java.util.List;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = new ArrayList<Integer>();

		l.add(10);
		l.add(10);
		l.add(14);
		l.add(19);
		l.add(20);

		System.out.println(l);
		int target = 13;
		if (l.contains(target)) {
			// put at the index of 14
			int i = l.indexOf(target);
			l.add(i, target);
		}

		else {
			int ind = 0;
			for (int i = 0; i < l.size(); i++) {
				if (l.get(i) > target) {
					ind = i;
					System.out.println("ind : "+ind);
					break;
				}

			}

			l.add(ind, target);
		}

		System.out.println(l);

	}

}
