package dsa_practise_12th_april_2022;

import java.util.Arrays;

public class MoveTargetElementToTheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,1,2,2,3,0,4,2};
		
		int target = 2;
		int non_target_elements_count = moveTargetToEnd(a, target);
		
		System.out.println(Arrays.toString(a));
		System.out.println(non_target_elements_count);
		
		
	}

	private static int moveTargetToEnd(int[] a, int target) {
		
		int start =0;
		int end = a.length-1;
		
		int non_target_elements_count = 0;
		
		int temp = 0;
		while(start < end)
		{
			// In left we encountered non-target, so keep moving until you get target
			if(a[start] != target)
			{
				start++;
			}
			
			// In right we encountered target, so keep moving until you dont get target

			else if(a[end] == target)
			{
				end --;
			}
			
			//Swap condition met , target is in left and non target is in right
			else if(a[start] == target && a[end]!=target)
			{
				temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				
				start++;
				end--;
			}
				
		}
		
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i] == target)
			{
				non_target_elements_count = i;
				break;
			}
		}
		
		return non_target_elements_count;
		
	}

}
