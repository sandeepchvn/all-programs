package org.tyss.Hashset;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Employee> emps = new HashSet<Employee>(10);
		Employee e = new Employee(3, "raju");
		emps.add(e);
		emps.add(e);
		emps.add(new Employee(2, "sandeep"));
		emps.add(new Employee(2, "sandeep"));
		emps.add(new Employee(2, "sandeep"));
		emps.add(new Employee(2, "sndeep"));
		emps.add(new Employee(2, "sndeep"));
		emps.add(new Employee(2, "sndeep"));
		emps.add(new Employee(2, "sndeep"));
		emps.add(new Employee(3, "sandeep"));
		System.out.println(emps);
		for (Employee em : emps) {
			int index = em.hashCode() % 10;
			System.out.println("index--  " + index + em);
		}
	}
}
