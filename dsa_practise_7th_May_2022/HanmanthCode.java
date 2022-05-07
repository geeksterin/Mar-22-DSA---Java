package dsa_practise_7th_May_2022;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4,4,45 };

		findMountaionArray(arr);

	}

	private static void findMountaionArray(int[] arr) {
		// TODO Auto-generated method stub
		int max = 0;
		boolean b = true;
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i] < arr[i - 1]) {
				max = arr[i];

				
				if (max < arr[i + 1]) {
					b = false;
					break;
				}

			}

		}

		System.out.println(b);

	}

}
