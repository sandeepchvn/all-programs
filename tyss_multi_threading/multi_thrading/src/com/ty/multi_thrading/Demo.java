package com.ty.multi_thrading;

public class Demo {

	public static void main(String[] args) {
		Thread t = new Thread();
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());

		Thread t2 = new Thread("sandeep");
		t2.setPriority(8);
		
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t2.getName());
		
		
		
		
		
		
	}
}
