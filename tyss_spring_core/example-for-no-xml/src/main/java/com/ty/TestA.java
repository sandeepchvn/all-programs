package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.variable.Mobile;

public class TestA {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Person.class);
	Person p=(Person)context.getBean("person");
	System.out.println(p.age);
	
	Mobile m=(Mobile)context.getBean("mobile");
	System.out.println(m.price);
	
	
}
}
