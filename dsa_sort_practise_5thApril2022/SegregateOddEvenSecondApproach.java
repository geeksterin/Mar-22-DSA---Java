package dsa_sort_practise_5thApril2022;

public class SegregateOddEvenSecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 3, 1, 56, 43, 12, 23, 45 };

		segregate(a);
	}

	public static void sortOddEven(int arr[], int n) {
		int start = 0;
		int end = n - 1;
		while (start < end) {
			if (isOdd(arr[start])) {
				start++;
			} else {
				swap(arr, start, end);
				end--;
			}
		}
	}

	private static boolean isOdd(int i) {
		boolean odd = 
	}

}
