package com.lamda.higher_order_function;

public class Driver {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print((a, b) -> a + b);
	}
}
