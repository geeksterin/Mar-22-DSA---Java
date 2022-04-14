package dsa_practise_14th_April_2022;

public class RemoveDuplicate_Element_with_ON_Sagar {
	public static void main(String args[]) {
		int arr[] = { -1,0, 0, 1, 1, 1, 2, 2, 3 ,3,6,78};
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
				continue;
			} else {
				arr[counter] = arr[i];
				counter = counter + 1;
			}
		}
		System.out.println("length is" + counter);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
