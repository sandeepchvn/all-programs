package com.ty.runnable;

public class Pen implements Runnable {

	@Override
	public void run() {

		System.out.println("pen is writting by runnable");
	}

	public static void main(String[] args) {
		Pen pen=new Pen();
		Thread t=new Thread(pen);
		t.start();
	}
}
