package dsa_practise_collections_1st_June_2022;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,1,2,4,3};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i =0;i<a.length;i++) {
			
			set.add(a[i]);
		}
		
		System.out.println(set);
		
	}

}
