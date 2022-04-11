package dsa_practise_week_arrays_11th_Apr_2022;


public class AjayJadhaoCode {

	public static void main(String[] args) {
		int[] a = {3,5,6,8,9,13,15,167,1690};
		int[] b = {5,7,9,9,9,15,1690};
		
		print(a,b);

	}

	private static void print(int[] a, int[] b) {
		int i=0;
		int j=0;
		while(i<a.length && j < b.length) {
			
			if(a[i] == b[j]) {
				System.out.print(b[j]+" ");
				i++;
				j++;
			}
			else if(a[i] > b[j]) {
				j++;
			}
			else {
				i++;
			}
		}
		
	}

}

