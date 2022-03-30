package dsa_30th_Mar_2022;

public class DeepakTest {

    static int binary(int arr[],int start,int end){
        while(start<=end){
           int mid = (start+end)/2;
           
           if(start > end)
           {
        	   return start;
           }
           
           //left
           if(arr[mid]==mid){
               start = mid+1;

             // end = mid-1;
           }
           
           //Right
           else{
        	   end = mid-1;
               //start = mid+1;
           }
        }

        return start;
    }

    public static void main(String args[]){
        int arr[] = {0,1,2,3,4,6};
        int n = arr.length;

        int missingNumber = binary(arr,0,n-1);

        System.out.println(missingNumber);
    }  
    
}
