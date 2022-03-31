package dsa_31st_March_2022;

public class FindFrequencyOfaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 1, 2, 2, 2, 2, 3, 4, 4, 4, 5, 6, 6 };

		int target = 0;
		int frequency = findFrequency(a, target);
		System.out.println(frequency);
				
		}

	private static int findFrequency(int[] a, int target) {
		// TODO Auto-generated method stub
		
		int first = FindTheFirstOccurenceOfNumber.findFirstOccurance(a, target);
		int last = FindLastOccurence.findlastOccurance(a, target);
		
		System.out.println("last : "+last);
		System.out.println("first : "+first);

		if(first==-1|| last==-1)
		{
			return 0;
		}
		
		int frequency = (first==-1 || last==-1?0:last-first+1);
		return (frequency);
		
	}
	

}
