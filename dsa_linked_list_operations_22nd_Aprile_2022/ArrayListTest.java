package dsa_linked_list_operations_22nd_Aprile_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList();
		
		LinkedList<Integer> b = new LinkedList();
		
		int[] c = {2,4,5,5,8,9};
		
		int val = 8;
		
		int ind = Arrays.binarySearch(c, val);
		System.out.println(ind);
	}

}
