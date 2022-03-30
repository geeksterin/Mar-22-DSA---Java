package dsa_30th_Mar_2022;

public class MissingNumber2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6 };
		int exp = arr.length + 1;
		int totalSum = exp * (exp + 1) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(totalSum - sum);

	}

}
