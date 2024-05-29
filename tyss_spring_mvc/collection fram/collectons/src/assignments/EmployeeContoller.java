package assignments;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeContoller {
	private LinkedList<Employee> emps = new LinkedList<Employee>();
	private Scanner read = new Scanner(System.in);

	public void addEmployee() {
		Employee e = new Employee();
		System.out.println("enter department name");
		e.setDepartment(read.next());
		System.out.println("enter employee name");
		e.setName(read.next());
		System.out.println("enter salary");
		e.setSalary(read.nextDouble());
		emps.add(e);
		System.out.println("Employee is adden successfully");
	}

	public void findAvgSalByDepName() {
		double avgSal = 0;
		System.out.println("enter the department name");
		String dep=read.next();
		for (Employee e : emps) {
			if (e.getDepartment().equalsIgnoreCase(dep)) {
				avgSal = e.getSalary() + avgSal;
			}
		}
		System.out.println("avarege salary of "+dep+" is " +avgSal);
	}
}
