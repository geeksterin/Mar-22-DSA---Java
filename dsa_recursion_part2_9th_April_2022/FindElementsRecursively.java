package dsa_recursion_part2_9th_April_2022;

public class FindElementsRecursively {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,5,6,7,83,2};
		
		int i = 0;
		print(a,i);
	}

	private static void print(int[] a, int i) {
		
		if(i==a.length-1)
		{
			System.out.println(a[i]);
			return;
		}
		
		else
		{
			print(a,i+1);
			if(i<a.length-1)
			{
				System.out.println(a[i]);

			}

		}
	}

}
