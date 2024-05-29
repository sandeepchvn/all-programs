package com.ty.multi_thrading;

public class MyThread implements Runnable{

	
	
	public static void main(String[]... args) {
		MyThread mt = new MyThread();
		mt.run();
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("-----------MyThread-----------");
	}
	
	
	
	
	
	
}
