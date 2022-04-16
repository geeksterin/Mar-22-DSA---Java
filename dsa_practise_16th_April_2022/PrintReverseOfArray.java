package dsa_practise_16th_April_2022;

public class PrintReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7,2,45,64,1};
		
		int i = a.length -1;
		
		print(a,i);
	}

	private static void print(int[] a, int i) {
		if(i < 0)
		{
			return;
		}
		
		else
		{
			System.out.println(a[i]);
			print(a,--i);
		}
		
	}

}
