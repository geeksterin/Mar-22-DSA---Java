package dsa_practise_6th_May_2022;

public class MinimumDistanceinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String s[] = { "the", "quick", "brown", "fox", "quick"};
		 */
		
		String s[] =  {"geeks", "for", "geeks", "contribute", 
	     "practice"};
		
		String word1 = "geeks";
		String word2 = "practice";
		
		System.out.println(distance(s,word1,word2));
	}
	
	static int distance(String[] s, String word1, String word2) {
		int count1 = -1, count2 = -1, minDis = Integer.MAX_VALUE;
		for (int i = 0; i < s.length; i++) {
			if (s[i] == word1)
				count1 = i;  
			if (s[i] == word2)
				count2 = i;  
			if (count1 != -1 && count2 != -1)
				minDis = Math.min(minDis, Math.abs(count1 - count2));
		}
		return (minDis==Integer.MAX_VALUE? -1: minDis);
	}

}
