package dsa_practise_collections_1st_June_2022;

import java.util.HashMap;
import java.util.Map;

public class HyderCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s ="qwtyuiopasdfdddghjklzxcvbnmgq";
	        Map<Character,Integer> map = new HashMap<>();
	        for(int i=0; i<s.length();i++){
	            Character c= s.charAt(i);
	            if(map.get(s)==null){
	                map.put(c,1);
	            }
	            else {
	                Integer v=map.get(c);
	                map.put(c,v+1);
	            }
	        }
	        //System.out.println(map);
	       {
	           int count =0;
	            for (char ch= 'a';ch<='z';ch++){
	               if(map.get(ch)!=null && map.get(ch)>=1){
	                   count++;
	               }
	              
	        }
	            
	            if(count==26){
	                   System.out.println("pangaram");
	               }
	               else
	                   System.out.println("not pangram");

	            }
	}

}
