package com.ty.syncronise;

public class Driver {
	public static void main(String[] args) {
		Trainer trainer = new Trainer();
		Students s = new Students("sandeep", trainer);
		Students s1 = new Students("shree", trainer);
		Students s2 = new Students("gagan", trainer);
		s.start();
		s1.start();
		s2.start();
	}
}