package dsa_threads_practise_21_May_2022;

import java.util.List;

public class AjayBCodeThread implements Runnable{
	List<String> myList;

	@Override
	public void run() {

		String name = "";

		if (myList != null && myList.size() > 0) {

			for (int i = 0; i < myList.size(); i++) {

				String s = myList.get(i);
				if (s.contains("name : ")) {

					name = s.substring(7, s.length());
				}

				if (s.contains("Pune") || s.contains("Bangalore")) {

					System.out.println(Thread.currentThread().getName());
					System.out.println(name);
				}
			}

		}

	}
}
