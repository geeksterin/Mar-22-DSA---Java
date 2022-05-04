package dsa_practise_4th_may_2022;

public class FindPivotElementWhereSumisSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 0 };
		int index = findPivot(a);
		System.out.println("Pivot : " + index);
	}

	private static int findPivot(int[] a) {
		int pivot = -1;
		int ind = -1;
		int start = 0;
		int end = a.length - 1;

		for (int i = 0; i < a.length; i++) {

			pivot = i;

			int left = findSum(start, pivot - 1, a);
			int right = findSum(pivot + 1, end, a);

			if (left == right) {

				ind = pivot;
				return ind;

			}

		}
		return ind;

	}

	private static int findSum(int start, int end, int[] a) {
		int sum = 0;

		if (end < start) {
			return 0;
		}

		for (int i = start; i <= end; i++) {
			sum += a[i];
		}
		return sum;
	}

}
