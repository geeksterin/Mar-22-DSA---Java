package dsa_practise_4th_may_2022;

public class SankalpCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 555, 901, 482 };
		findNumbers(arr);
	}

	public static void findNumbers(int[] arr) {
		int count = 0;
		int evenCount = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[i];

			while (temp > 0) {
				temp = temp / 10;
				count++;

			}
			

			if (count % 2 == 0) {
				evenCount++;
			}
			
			
			count = 0;
		}

		System.out.println(evenCount);
	}
}
