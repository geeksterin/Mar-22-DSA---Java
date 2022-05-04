package dsa_practise_4th_may_2022;

public class NidhiCode {

	public static void main(String[] args) {
		int arr[] = { 12, 345, 28808, 789, 7896,96 };

		int x = findevenNumberDigits(arr);
		System.out.println(x);

	}

	private static int findevenNumberDigits(int[] arr) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int count = 0;

			while (temp != 0) {

				temp = temp / 10;
				count = count + 1;

			}
			if (count % 2 == 0) {
				result++;
			}


		}
		
		return result;

	}

}
