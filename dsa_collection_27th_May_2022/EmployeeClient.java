package dsa_collection_27th_May_2022;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee(1,"A","Bangalore");
		Employee e2 = new Employee(2,"B","Mumbai");
		Employee e3 = new Employee(3,"C","Bangalore");
		Employee e4 = new Employee(4,"D","Pune");
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);


		for(int i=0;i<list.size();i++) {
			Employee emp = list.get(i);
			if(list.get(i).city.equals("Bangalore"))
			{
				System.out.println(list.get(i).name);
			}
		}
		
		System.out.println("------------");
		
		for(Employee emp : list)
		{
			if(emp.city.equals("Bangalore"))
			{
				System.out.println(emp.name);
			}
		}
		
		
	}

}
