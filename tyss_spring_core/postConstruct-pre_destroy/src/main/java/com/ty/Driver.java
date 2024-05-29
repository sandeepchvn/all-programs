package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) context.getBean("myStudent");
		System.out.println(student);
		context.close();
	}
}
