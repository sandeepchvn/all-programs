package com.lamda.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {
	public static void main(String[] args) {

		Employee employee = new Employee(1, "B", "123", 34567);
		Employee employee2 = new Employee(4, "Z", "143", 987);
		Employee employee3 = new Employee(2, "A", "23", 432);
		Employee employee4 = new Employee(8, "C", "1233", 654);
		Employee employee5 = new Employee(8, "C", "1233", 654);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee);
		employees.add(employee4);
		
		//list converted to set
		Set<Employee> setEmp=new HashSet<Employee>(employees);
		
		
		Collections.sort(employees, (emp1, emp2) -> emp1.getId() - emp2.getId());
		
		System.out.println(setEmp);

	}
}















//Comparator<Employee> comparator=(emp1,emp2)->{
//if(emp1.getId() > emp2.getId()) {
//	return 1;
//}else if(emp1.getId() < emp2.getId()) {
//	return -1;
//}else
//	return 0;
//};