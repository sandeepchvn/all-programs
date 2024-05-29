package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		//
		Person p = (Person) context.getBean("person");
		p.run();
		// Injecting value to the variable
		Student s = (Student) context.getBean("student");
		System.out.println("Student Age " + s.age);
		// Injecting value using Constructor
		Pen pen = (Pen) context.getBean("pen");
		System.out.println("Pen Price " + pen.price);
		// Injecting value using setter
		Employee e = (Employee) context.getBean("employee");
		System.out.println("Employee Id " + e.getId());
		System.out.println("Employee Name " + e.getName());
	}
}
