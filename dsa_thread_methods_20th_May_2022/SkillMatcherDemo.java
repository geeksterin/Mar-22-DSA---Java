package dsa_thread_methods_20th_May_2022;

public class SkillMatcherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SkillMatcher r1 = new SkillMatcher();
		Thread t1 = new Thread(r1);
		
		r1.dir = "C:\\Users\\U6054381\\OneDrive - Clarivate Analytics\\Desktop\\Personal\\Geekster\\DSA\\ThreadDemo\\A\\";
		
		SkillMatcher r2 = new SkillMatcher();
		Thread t2 = new Thread(r2);
		r2.dir = "C:\\Users\\U6054381\\OneDrive - Clarivate Analytics\\Desktop\\Personal\\Geekster\\DSA\\ThreadDemo\\B\\";
		
		
		SkillMatcher r3 = new SkillMatcher();
		Thread t3 = new Thread(r3);
		r3.dir = "C:\\Users\\U6054381\\OneDrive - Clarivate Analytics\\Desktop\\Personal\\Geekster\\DSA\\ThreadDemo\\C\\";
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
