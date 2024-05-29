package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	public static void main(String[] args) {
		//ApplicationContext is a Spring J2EE container
		ApplicationContext appContext=new ClassPathXmlApplicationContext("person_config.xml");
		// to get bean object in Driver class we have method getBean("id name of the class");
		Person person=(Person)appContext.getBean("myPerson");
		person.message();
	}
}
