package dsa_practise_6th_May_2022;

import java.util.Scanner;

public class HariCode {

	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		
		int[] ar=new int[s];
		
		for(int i=0;i<s;i++) {
			ar[i]=sc.nextInt();
		}
		
		//m -> find max in the a array
		int ans=element(s,ar);
		int[] b=new int[m+1];
		}
}




private static int element(int s, int[] ar) {
// TODO Auto-generated method stub
int m=0;
for(int i=0;i<s;i++) {
	if(ar[i]>m) {
		m=ar[i];
	}
}
return m;
}

}
