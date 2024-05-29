package com.ty;

public class Person {
	private Mobile mobile;

	public Person(Mobile mobile) {
		this.mobile = mobile;
	}

	public void use() {
		System.out.println("person is using");
		mobile.ring();
	}
}
