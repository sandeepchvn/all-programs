package com.ty.multi_thrading;

public class MyThreadDriver {
	
	private void run() {
		System.out.println("thread started");
	}

	public static void main(String[] args) {

		MyThread mt = new MyThread();

		mt.run();

	}
}
