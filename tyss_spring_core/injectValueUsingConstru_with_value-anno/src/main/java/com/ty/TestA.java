package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("conf.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p.age);
		System.out.println(p.name);
	}
}
