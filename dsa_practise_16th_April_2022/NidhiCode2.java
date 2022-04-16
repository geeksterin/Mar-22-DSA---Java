package dsa_practise_16th_April_2022;


public class NidhiCode2 {

	public static void main(String[] args) {

      int n=10,sum=0;
      Sum1To10(n,sum);

	}

	private static void Sum1To10(int n,int sum) {
		
		if(n<0)
		{
		 System.out.print(sum);
		 return;
		}
		else
		{
			sum=sum+n;
			Sum1To10(n-1,sum);
			
		   
		}
		
	}

}
