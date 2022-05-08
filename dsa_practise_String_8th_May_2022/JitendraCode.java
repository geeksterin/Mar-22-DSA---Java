package dsa_practise_String_8th_May_2022;

public class JitendraCode {

	public static void main(String[] args){
        String str=" to my world Welcome fgff";
        String  str1="";
        String word="Welcome";
        String s[]=str.split(" ");
        for(int i=word.length()-1;i>=0;i--){
            str1+=word.charAt(i);
        }

        for(int j=0;j<s.length;j++){
            if(!word.equalsIgnoreCase(s[j])){
                str1=str1+" "+s[j]+" ";
            }

        }
        System.out.println(str1);
    }

}
