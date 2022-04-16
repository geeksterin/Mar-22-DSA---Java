package dsa_practise_16th_April_2022;

public class PrintarrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {5,9,45,89,78};
		
		int i = 0;
		
		print(a,i);
		
	}

	private static void print(int[] a, int i) {
		if(i> a.length-1)
		{
			return;
		}
		
		else
		{ 

			System.out.println(a[i]);
			print(a,i+1);

		}
		
	}

}
