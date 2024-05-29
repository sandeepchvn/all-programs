package com.ty;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");

	Student student=(Student)context.getBean("myStudent");

	System.out.println("name "+student.getName());
	System.out.println("name "+student.getAge());
	
	List<String> students=student.getSubjectName();
	System.out.println("subjects---------");
	for (String string : students) {
		System.out.println(string);
	}
	
}
}
