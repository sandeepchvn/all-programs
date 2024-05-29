package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
		Student student = (Student) applicationContext.getBean("myStudent");
		Teacher teacher = (Teacher) applicationContext.getBean("myTeacher");
		student.run();
		teacher.run();
	}

}
