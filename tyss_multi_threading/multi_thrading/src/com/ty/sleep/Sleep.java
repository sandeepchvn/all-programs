package com.ty.sleep;

import java.util.Iterator;

public class Sleep extends Thread{

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
