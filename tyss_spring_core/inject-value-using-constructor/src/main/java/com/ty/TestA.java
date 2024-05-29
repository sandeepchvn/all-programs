package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) context.getBean("myStudent");

		student.printName();
		
		System.out.println("-------------Teacher details------------");
		Teacher teacher=(Teacher)context.getBean("myTeacher");
		teacher.printDetails();
	}
}
