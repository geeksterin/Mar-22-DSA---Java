package dsa_practise_7th_May_2022;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,90,3,6,7,8,8,9,17};
		
		boolean bool = checkIfSorted(a);
		System.out.println(bool);
	}

	private static boolean checkIfSorted(int[] a) {
		
		if(a.length == 0) {
			return false;
		}
		
		if(a.length == 1) {
			return true;
		}
		
		else {
			
			for(int i =1;i<a.length;i++) {
				if(a[i]<a[i-1]) {
					return false;
				}
			}
			
			return true;
		}
	}

}
