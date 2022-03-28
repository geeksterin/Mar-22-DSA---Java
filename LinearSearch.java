package search_28thMar2022;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 89;
		
		int a[] = {2,1,3,17,78,34,89};  
		
		int searchIndex = searchNumber(a,num);
		System.out.println(searchIndex);
		
	}

	
	public static int searchNumber(int a[], int num)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println("Found!");
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	

}
