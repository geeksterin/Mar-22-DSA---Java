package dsa_practise_subarrays_9th_May_2022;

public class FindTheCountOfSubArraysWithSumEqualToK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		
		int k = 3;
		int count =0;
		
		for(int i =0;i<a.length;i++) {
			int sum = 0;
			for(int j =i;j<a.length;j++) {
				sum = sum + a[j];
				
				/*
				 * if(sum == k) { count++; }
				 */
				System.out.println(sum);
			}
		}
		
		System.out.println("Count : "+count);
	}

}
