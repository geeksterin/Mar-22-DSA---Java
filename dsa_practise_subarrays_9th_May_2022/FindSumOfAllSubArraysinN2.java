package dsa_practise_subarrays_9th_May_2022;

public class FindSumOfAllSubArraysinN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4 };
		
		int sum =0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				// print from i to j

				for (int k = i; k <= j; k++) {
					System.out.print(a[k] + " ");
					
					sum = sum+a[k];
					
				}
				System.out.println();
			}
		}
		
		System.out.println("Sum : "+sum);
	}

}
