package dsa_sort_3rd_April_2022;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7,8,4,1,2,3};
		
		 int b[] = bubbleSort(a);
		 
		 for(int k =0;k<b.length;k++)
		 {
			 System.out.print(b[k] + " ");
		 }
		 
	}
	
	public void display()
	{
		System.out.println("Hello");
	}

	public static int[] bubbleSort(int[] a) {
		
		int n = a.length-1;
		int temp = 0;
		
		// How many times you have to find the largest element ?
		for(int i =0;i<n;i++)
		{
			
			// Compare every element and see if its greater than next ele, if so, swap
			for(int j =0;j<n-i;j++)
			{
				//check & swap
				if(a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		
		return a;

	}

}
