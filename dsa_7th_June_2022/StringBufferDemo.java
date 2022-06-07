package dsa_7th_June_2022;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		
		s = s+"world";
		
		StringBuffer sb = new StringBuffer("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		
		sb.reverse();

		sb.append("world");
	}

}
