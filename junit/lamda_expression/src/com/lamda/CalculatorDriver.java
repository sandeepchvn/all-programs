package com.lamda;

public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator calculator=(a,b,c,m)->{
			System.out.println(m+(a+b+c));
		};
		calculator.add(3, 2, 5, "addition is :");
	}
}
