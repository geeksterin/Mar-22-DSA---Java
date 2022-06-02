package dsa_map_31st_May_2022;

public class BinaryMaxSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "0101010001100111";
		
		int a[] = {0,1,1,1,0,0,0,1,1};
		
		int max = 0;
		int count = 0;
		for(int i =0;i<a.length-1;i++) {
			
			if(a[i]!=a[i+1])
			{
				count++;
			}
			
			else {
				count = 0;
				max = Math.max(max, count);
			}
		}
		
		System.out.println(max);
		
	}

}
