package dsa_31st_March_2022;

public class FindLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6 };

		int target = 62;
		int lastOccurence = findlastOccurance(a, target);
		System.out.println(lastOccurence);
	}

	public static int findlastOccurance(int[] a, int target) {
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			System.out.println("start :" + start + ", mid : " + mid + ", end : " + end);
			
			if(mid == a.length-1 && target == a[mid])
			{
				return mid;
			}
			
			if(mid == a.length-1 && target != a[mid])
			{
				return -1;
			}
			

			// When to return?
			if (a[mid] == target && a[mid+1] > target) {
				return mid;
			}

			// If you dont find the item, how to go right

			else if (target >=a[mid]) {
				start = mid + 1;
			}
			// If you dont find the item, how to go left?

			else {
				end = mid - 1;
			}
		}
		return -1;
	}

}
