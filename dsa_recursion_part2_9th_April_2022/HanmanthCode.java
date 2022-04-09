package dsa_recursion_part2_9th_April_2022;

public class HanmanthCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5 };

		print(arr, 0);

	}

	private static void print(int[] arr, int i) {
		// TODO Auto-generated method stub

		if (i == arr.length - 1) {
			System.out.print(arr[i] + " ");
			return;
		}

		System.out.print(arr[i] + " ");
		print(arr, i + 1);

	}

}
