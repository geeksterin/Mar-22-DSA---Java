package dsa_oops_23rd_May_2022;

public class Y extends X{

	
	Y(){
		System.out.println("default Y");
	}
	
	Y(int x){
		super(x);
		System.out.println("parametrised Y");
	}
}
