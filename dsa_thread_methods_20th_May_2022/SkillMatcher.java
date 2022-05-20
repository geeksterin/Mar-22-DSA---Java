package dsa_thread_methods_20th_May_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SkillMatcher implements Runnable{

	String dir;
	
	@Override
	public void run() {
		
		File file = new File(dir);
		String[] fileNamesInDirectory = null;
		
		List<String> list = new ArrayList<String>();
		
		if(file.isDirectory()) {
			fileNamesInDirectory = file.list();
		}
		
		if(fileNamesInDirectory!=null && fileNamesInDirectory.length>0)
		{
			//Read the content of each file
			for(String f :fileNamesInDirectory)
			{
				try {
					BufferedReader br = new BufferedReader(new FileReader(new File(dir+f)));
					String line = "";
					
					while((line = br.readLine())!=null)
					{
						line = line.toLowerCase();
						if(line.contains("java"))
						{
							list.add(f);
							break;
						}
					}
					
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("Skills found at these resumes : ");
		System.out.println(list);
	}

}
