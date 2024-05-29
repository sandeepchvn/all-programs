package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	int age;
	String name;
	
	public Person(@Value(value = "102")int age,@Value(value = "gagan") String name) {
		this.age = age;
		this.name = name;
	}

}
