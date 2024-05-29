package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("myStudent");
		System.out.println("name is "+student.getNamt());
		System.out.println("age is "+student.getAge());
		System.out.println("height is "+student.getHeight());
	}
}
