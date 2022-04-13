package dsa_practise_session_3_13th_April_2022;

public class SagarCode {
	public static void main(String args[]) {
		//int arr[] = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 6 };
		int arr[] = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 6, 6 };

		int target = 5;
		int first = findOccurence(arr, target);
		int last = lastOccurence(arr, target);
		
		System.out.println(first+", "+last);
	}

	public static int findOccurence(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
		
			int mid = start + (end - start) / 2;
			
			/*
			 * System.out.println("Start : "+start); System.out.println("Mid : "+mid);
			 * System.out.println("End : "+end);
			 */


			if (mid == 0 && arr[mid] == target) {
				//System.out.print(" " + mid);
				return mid;
			}

			if (arr[mid] == target && arr[mid] != arr[mid - 1]) {
				//System.out.print(mid + " ");
				return mid;
			}

			else if (arr[mid] < target) {
				start = mid + 1;
			} 
			
			else {
				end = mid - 1;
			}
		}

		return -1;
	}

	public static int lastOccurence(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid == arr.length - 1 && arr[mid] == target) {
				//System.out.print(" " + mid);
				return mid;
			}
			
			if (arr[mid] == target && arr[mid] != arr[mid + 1]) {
				//System.out.print(" " + mid);
				return mid;
			} 
			
			else if (arr[mid] > target) {
				end = mid - 1;
			} 
			
			else {
				start = mid + 1;
			}
		}

		return -1;
	}
}
