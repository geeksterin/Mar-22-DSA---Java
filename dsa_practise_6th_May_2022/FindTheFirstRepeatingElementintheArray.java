package dsa_practise_6th_May_2022;

public class FindTheFirstRepeatingElementintheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int index = -1;
		int a[] = {1, 5, 3, 4, 3, 5, 6};
		
		//1. find Max
		
		int max = findMax(a);
		//System.out.println(max);
		
		//2. Create a map array
		int[] b = new int[max+1];
		
		//3. Iterate and increment
		for(int i =0;i<a.length;i++) {
			int x = a[i];
			b[x] = b[x]+1;
			
		}
		
		//4. Print
		for(int i =0;i<a.length;i++) {
			int x = a[i];
			if(b[x]>1) {
				System.out.println("x : "+x +" is appearing moe than once");
				index = i+1;
				break;
			}
		}
		
		
		//Iterate a array
		
	}

	private static int findMax(int[] a) {
		
		int max = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		
		return max;
	}

}
