package dsa_oops_23rd_May_2022;

public class Calculator {

	int add(int x, int y) {
		System.out.println("method1");
		return x+y;
	}
	
	int add(int x, int y, int z) {
		System.out.println("method2");

		return x+y+z;
	} 
	
	float add(float x, float y) {
		System.out.println("method3");

		return x+y;
	}
}
