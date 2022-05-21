package dsa_threads_practise_21_May_2022;

import java.util.List;

public class AyeshaThreadClass implements Runnable{

	   List<String> mylist;
	    @Override
	    public void run() {
	        String name="";
	        if(mylist!= null && mylist.size()>0){
	            for(int i=0;i<mylist.size();i++) {
	                String s = mylist.get(i);
	                if(s.contains("name : ")){
	                    name=s.substring(7,s.length());
	                }
	                if(s.contains("Geekster")){
	                    System.out.println(Thread.currentThread().getName());
	                    System.out.println(name);
	                }
	            }
	        }

	    }

}
