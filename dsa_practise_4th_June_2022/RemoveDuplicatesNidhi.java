package dsa_practise_4th_June_2022;


public class RemoveDuplicatesNidhi {
    public static void main(String args[]) {
      String str= "abcaabbcaaba";
      String result=removeDuplicate(str);
      System.out.println(result);
    }
    
    public static String removeDuplicate(String str1)
    {
       String s="";
       for(int i=0;i<str1.length();i++)
       {
           if(!s.contains(str1.charAt(i)+""))
           {
               s=s + str1.charAt(i)+"";
           }
       }
       return s;
    }
}
