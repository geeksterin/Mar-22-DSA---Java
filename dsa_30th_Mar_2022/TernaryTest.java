package dsa_30th_Mar_2022;


public class TernaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// even 2, odd 1
		int x = 10;
		
		int res  = 0;
		
		if(x%2==0)
		{
			res = 2;
		}
		
		else
		{
			res = 1;
		}
		
		 res = (x%2==0 ? 2 : 1 );
	}

}
