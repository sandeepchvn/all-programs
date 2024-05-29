package com.ty.data_inconsistency;

public class Data1 extends Thread{
	@Override
	public void run() {
		for (int i = 65; i < 70; i++) {
			System.out.println((char)i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
