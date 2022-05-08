package dsa_practise_String_8th_May_2022;

public class FindTheOccurenceOfaWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome to my world. You are always welcome anytime";

		String word = "welcome1";

		s = s.toLowerCase();

		int count = findCount(s, word);
		System.out.println(count);
	}

	private static int findCount(String s, String word) {

		int count = 0;
		
		if(s!=null && s.length()==0){
			return count;
		}
		
		if(word!=null && word.length()==0){
			return count;
		}

		String a[] = s.split(" ");

		for (int i = 0; i < a.length; i++) {
			String b = a[i];
			if (b.equals(word)) {
				count++;
			}
		}

		return count;

	}

}
