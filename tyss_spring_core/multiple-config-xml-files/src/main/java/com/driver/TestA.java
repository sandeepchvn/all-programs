package com.driver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ty.Teacher;

public class TestA {
public static void main(String[] args) {
	ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("config1.xml");
	Teacher teacher=(Teacher)applicationContext.getBean("myTeacher");
	teacher.runTeacher();
	//applicationContext.getBean("myStudent"); //CTE
}
}
