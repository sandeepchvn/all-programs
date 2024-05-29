package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Person p=(Person)context.getBean("person");
	System.out.println(p.getAge());
}
}
