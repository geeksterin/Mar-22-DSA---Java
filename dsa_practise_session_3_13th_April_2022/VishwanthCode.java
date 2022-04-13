package dsa_practise_session_3_13th_April_2022;

public class VishwanthCode {

	public static void main(String a[]) {

		int[][] arr = { { 1, 9, 0 }, { 8, 1, 0 }, { 0, 0, 1 } };

		int count = 0;

		int i =0;
		int j = 0;
		for(i =0;i<arr.length;i++) {
			for( j = 0;j<arr.length;j++) {
				
				if(arr[i][j]==0) {
					count = count+1;
					
				}
				
			}
		}
			if(count>( i*j)/2) {
				System.out.println("ITS sparse");
			}
			else {
				System.out.println("Its not");
			}
		}
	
}
