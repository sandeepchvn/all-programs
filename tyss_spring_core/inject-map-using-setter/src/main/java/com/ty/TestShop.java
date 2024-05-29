package com.ty;

import java.util.Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestShop {
public static void main(String[] args) {
	ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	Shop shop=(Shop)context.getBean("myShop");
	
	System.out.println("name "+shop.getName());
	
	Map<String, Double> map=shop.getItems();
	
	for (Map.Entry<String, Double> entry : map.entrySet()) {
		System.out.println(entry.getKey()+"------>"+entry.getValue());
	}
}
}
