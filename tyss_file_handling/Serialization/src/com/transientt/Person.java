package com.transientt;

import java.io.Serializable;

public class Person implements Serializable {
	int phone;
	transient int age;
	public Person(int phone, int age) {
		this.phone = phone;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [phone=" + phone + ", age=" + age + "]";
	}

}