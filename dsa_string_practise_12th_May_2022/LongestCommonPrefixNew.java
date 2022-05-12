package dsa_string_practise_12th_May_2022;

public class LongestCommonPrefixNew {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "flowersing", "flowers", "flow" ,"fl"};
		String pre = longestCommonPrefix(s);
		System.out.println(pre);
		
	}

	public static String longestCommonPrefix(String[] S) {
		//boolean reduceFurther = true;
		String prefix = S[0]; // 
		int count = 0;
		for (int i = 1; i < S.length; i++) {

			if (!S[i].startsWith(prefix)) { //flowers.startsWith(flowersi)
				prefix = prefix.substring(0, prefix.length() - 1);
				System.out.println("prefix :: "+prefix);
			}
			
			else {
				count++;
			}
			
		}
		
		System.out.println("count ->"+count);
		if(count == S.length-1)
		{
			return prefix;
		}
		
		return "";
	}
}
