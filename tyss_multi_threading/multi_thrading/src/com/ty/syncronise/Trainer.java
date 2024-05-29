package com.ty.syncronise;

public class Trainer extends Thread {

	synchronized public static void askQ(String name) {
		System.out.println(name + " Asked Quetion");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name + " got answer");
	}
}
