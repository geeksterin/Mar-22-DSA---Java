package dsa_practise_6th_May_2022;

public class AjayJadhao {

	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		
		String[] arr = str.split("\\.");

		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+".");
		}
		

	}
}
