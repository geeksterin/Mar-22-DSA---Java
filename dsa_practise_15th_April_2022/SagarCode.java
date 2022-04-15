package dsa_practise_15th_April_2022;

public class SagarCode{
    public static void main(String args[]){
		/*
		 * int matrix[][]={ {1,2,3,6}, {0,2,1,4}, {8,7,9,2}, {-9,-5,-4,-3}
		 * 
		 * };
		 */
        
		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

    // create row to column (transpose matrix)   
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
         
            int temp=0;
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
           
            }
        }
// swap value in row ([0,0]<=>[0,3])
        int top=0;
        int bottom=matrix.length-1;
        int j=0;
        int k=matrix[0].length-1;
        while(top<=bottom && j<=k){
         
          int temp=0;
          temp=matrix[top][j];
          matrix[top][j]=matrix[top][k];
          matrix[top][k]=temp;
          j++;
          k--;
             if(j+1 > k){
                top=top+1;
                k=matrix[0].length-1;
                j=0;
            }
        }
  // print rotate matrix

for(int l=0;l<matrix.length;l++){
            for(int x=0;x<matrix[0].length;x++){
              System.out.print(matrix[l][x]+" ");  
            }
            System.out.println();
        }

    }
}