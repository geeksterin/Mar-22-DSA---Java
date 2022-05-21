package dsa_threads_practise_21_May_2022;

public class MyThreadList {

	public class MyThreadList {
		private List<String> myList;

		public static void main(String[] args) {


			List<String> aList = new ArrayList<String>();
			aList.add("name : Vidya");
			aList.add("College : JSS");
			aList.add("Technology : Java/Angular");
			aList.add("Trained at Geekster");

			List<String> bList = new ArrayList<String>();
			bList.add("name : Divya");
			bList.add("College : JSS");
			bList.add("Technology : Java/React");
			bList.add("Trained at Geekster");

			List<String> cList = new ArrayList<String>();
			cList.add("name : Darshan");
			cList.add("College : JSS");
			cList.add("Technology : HTML/CSS");
			cList.add("Trained at Other Training school");

			MyThreadList r=new MyThreadList();
			Thread t1=new Thread( r);
			t1.setName("AList");
			r.myList=aList;
			MyThreadList r1=new MyThreadList();
			Thread t2=new Thread( r1);
			t2.setName("AList");
			r1.myList=bList;


			MyThreadList r3=new MyThreadList();
			Thread t3=new Thread

}
