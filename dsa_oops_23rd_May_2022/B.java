package dsa_oops_23rd_May_2022;

public class B {

	B(){
		System.out.println("deafult");
	}
	
	B(int x)
	{
		this();
		System.out.println("para 1");
	}
	
	B(int x, int y){
		this(x);
		System.out.println("para 2");
	}
}
