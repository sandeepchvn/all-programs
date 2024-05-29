package com.tyss;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestBean {

	public static void main(String[] args) {
		Resource  resource=new  ClassPathResource("my_conf.xml");
		BeanFactory bf=new XmlBeanFactory(resource);
		Person per=(Person)bf.getBean("myPerson");
		per.message();
	}
}
