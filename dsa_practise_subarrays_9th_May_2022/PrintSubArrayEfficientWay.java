package dsa_practise_subarrays_9th_May_2022;

public class PrintSubArrayEfficientWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4};
		
		for(int i =0;i<a.length;i++) {
			
			String s = "";
			for(int j=i;j<a.length;j++) {
				//print from i to j
				
				s = s+a[j]+" ";
				System.out.println(s);
			}
			
			System.out.println();
		}
	}
	}


