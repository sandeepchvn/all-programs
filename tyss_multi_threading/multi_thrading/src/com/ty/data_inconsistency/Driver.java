package com.ty.data_inconsistency;

public class Driver {
	public static void main(String[] args) {
		Data1 data1 = new Data1();
		Data2 data2 = new Data2();
		data1.start();
		data2.start();
	}
}
