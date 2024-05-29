package com.ty;

public class Teacher {
	private String name;
	private int age;
	private double height;

	public Teacher(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void printDetails() {
		System.out.println("name is:" + name);
		System.out.println("age is:" + age);
		System.out.println("height is:" + height);
	}
}
