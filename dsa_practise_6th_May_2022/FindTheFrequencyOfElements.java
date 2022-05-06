package dsa_practise_6th_May_2022;

public class FindTheFrequencyOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		for(int i =0;i<b.length;i++) {
			if(b[i]>1)
			{
				System.out.println(i+" frequency is : "+b[i]);
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
