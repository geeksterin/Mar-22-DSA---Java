package dsa_sort_practise_5thApril2022;

public class SegregateOddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {2,3,1,56,43,12,23,45};
		
		segregate(a);

		//System.out.println(a);
		
	}

	private static void segregate(int[] arr) {
		// TODO Auto-generated method stub
		
		int left = 0;
		int right = arr.length-1;
		
		while(left<right)
		{
			if(arr[left]%2==1)
				left++;
			else if(arr[right]%2==0)
				right--;
			else if(arr[left]%2==0 && arr[right]%2==1)
			{
				 
				 int temp=arr[left];
		          arr[left]=arr[right];
		          arr[right]=temp;
		          left++;
		          right--;
			}
			
			 for(int i=0;i<arr.length;i++)
		      {
		         System.out.print(arr[i]+" ");
		      }
			 
			 System.out.println();
				
		}
		
		//System.out.println(arr);
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.print(arr[i]+" "); }
		 */
      

	}

}
