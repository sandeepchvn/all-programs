package com.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.Student;

public class TestB {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		Student student = (Student) context.getBean("myStudent");
		student.runStudent();
	}
}
