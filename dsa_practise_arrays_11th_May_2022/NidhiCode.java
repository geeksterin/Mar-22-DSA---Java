package dsa_practise_arrays_11th_May_2022;

import java.util.Arrays;

public class NidhiCode {

	public static void main(String[] args) {
		String str = "a,b$c";
		int left = 0, right = str.length() - 1;
		
		char[] a = str.toCharArray();

		
		Character ch = new Character('1');
		
		while(left<right) {
			
			if(!ch.isLetter(a[left])) {
				left++;
			}
			
			else if(!ch.isLetter(a[right])) {
				right--;
			}
			
			else {
				char temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			
		}
		
		String temp = "";
		for(int k =0;k<a.length;k++) {
			temp = temp +a[k];
		}
		
		System.out.println(temp);
		}

	}


