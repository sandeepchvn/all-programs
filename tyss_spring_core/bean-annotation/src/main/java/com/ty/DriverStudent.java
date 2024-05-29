package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DriverStudent {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		Student s=(Student)context.getBean("stu");
		s.play();
		
		InsertStudent c=(InsertStudent)context.getBean("in");
		c.student.play();
	}
}
