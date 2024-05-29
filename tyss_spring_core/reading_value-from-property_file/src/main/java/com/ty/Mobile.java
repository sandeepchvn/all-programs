package com.ty;

public class Mobile {
	private int cost;
	private String name;

	public Mobile(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}
	public void display() {
		System.out.println("Cost is "+cost);
		System.out.println("Name is "+name);
	}
}
