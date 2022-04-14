
package dsa_practise_14th_April_2022;

import java.util.ArrayList;
import java.util.List;

public class SetMatrixZeroesMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 0, 1, 2, 0 }, { 3,4,5,2 }, { 1,3,1,5 } };

		int row = -1;
		int column = -1;

		boolean found = false;
		
		List<Integer> rowList = new ArrayList<Integer>();
		List<Integer> colList = new ArrayList<Integer>();
		
		int rowSize = a.length-1;
		int colSize = a[0].length-1;


		for (int i = 0; i <= rowSize; i++) {
			for (int j = 0; j <= colSize; j++) {
				if (a[i][j] == 0) {
					found = true;
					row = i;
					column = j;
					
					rowList.add(row);
					colList.add(column);
				}
			}
			
		}

		System.out.println("Row :: " + rowList);
		System.out.println("Col :: " + colList);
		System.out.println(rowList.size());

		// row
		if (found == true) {
			
			for(int m =0;m<rowList.size();m++)
			{
				for (int j = 0; j <= colSize; j++) {
					a[rowList.get(m)][j] = 0;
				}
			}
			

			// column
			
			for(int k =0;k<colList.size();k++)
			{
				for (int i = 0; i <= rowSize; i++) {
					a[i][colList.get(k)] = 0;
				}
			}
			

		}

		for (int i = 0; i <= rowSize; i++) {
			for (int j = 0; j <= colSize; j++) {
				System.out.print(a[i][j] + " ");

			}
			System.out.println();
		}

	}

}
