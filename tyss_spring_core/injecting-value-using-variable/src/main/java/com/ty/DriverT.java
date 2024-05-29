package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverT {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
		Teacher t = (Teacher) context.getBean("teacher");
		System.out.println(t.age);
	}
}
