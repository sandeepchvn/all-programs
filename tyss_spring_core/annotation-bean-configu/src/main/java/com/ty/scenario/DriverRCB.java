package com.ty.scenario;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverRCB {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		RCB r=(RCB)context.getBean("RCB");
		r.play();
		System.out.println("hi");
	}
}
