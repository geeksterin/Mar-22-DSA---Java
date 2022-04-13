package dsa_practise_session_3_13th_April_2022;

public class FindTheFirstAndLastOccurenceInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 6, 6 };

		int target = 2;

		int first = findFirstOccurenceNew(a, target);
		System.out.println(first);

	}

	private static int findFirstOccurence(int[] a, int target) {

		int start = 0;
		int end = a.length - 1;

		if (a[0] == target) {
			return 0;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			System.out.println("Start : " + start);
			System.out.println("Mid : " + mid);
			System.out.println("End : " + end);

			/*
			 * if (mid == 0) { if (a[mid] == target) { return mid; }
			 * 
			 * else { return -1; } }
			 */

			if (a[mid] == target) {
				if (a[mid - 1] < target) {
					return mid;
				}

				else if (a[mid - 1] == target) {
					end = mid - 1;
				}
			}

			else if (target > a[mid]) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}

			/*
			 * if(a[mid] == target && a[mid-1] < target) { return mid; }
			 * 
			 * else if(target > a[mid]) { start = mid +1; }
			 * 
			 * else { end = mid-1; }
			 */

		}

		return -1;

	}

	private static int findFirstOccurenceNew(int[] a, int target) {

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			System.out.println("Start : " + start);
			System.out.println("Mid : " + mid);
			System.out.println("End : " + end);

			// if we found element at mid ----1,check if mid 0 return 0 else if mid -1
			// position is not target then return mid else end=mid-1

			if (a[mid] == target) {
				if (mid == 0) {
					return 0;
				}

				else if (a[mid - 1] != target) {
					return mid;
				}

				/*
				 * else { end = mid - 1; }
				 */

			}

			else if (target > a[mid]) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}

			/*
			 * if(a[mid] == target && a[mid-1] < target) { return mid; }
			 * 
			 * else if(target > a[mid]) { start = mid +1; }
			 * 
			 * else { end = mid-1; }
			 */

		}

		return -1;

	}

	private static int findLastOccurence(int[] a, int target) {

		int start = 0;
		int end = a.length - 1;

		if (a[0] == target) {
			return 0;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			System.out.println("Start : " + start);
			System.out.println("Mid : " + mid);
			System.out.println("End : " + end);

			/*
			 * if (mid == 0) { if (a[mid] == target) { return mid; }
			 * 
			 * else { return -1; } }
			 */

			if (a[mid] == target) {
				if (a[mid - 1] < target) {
					return mid;
				}

				else if (a[mid - 1] == target) {
					end = mid - 1;
				}
			}

			else if (target > a[mid]) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}

			/*
			 * if(a[mid] == target && a[mid-1] < target) { return mid; }
			 * 
			 * else if(target > a[mid]) { start = mid +1; }
			 * 
			 * else { end = mid-1; }
			 */

		}

		return -1;

	}

}
