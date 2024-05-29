package com.lamda.explicit_return;

public class CalculatorDriver {

	public static void main(String[] args) {
		Calculator calculator=(num1 , num2 ,m)->{
			m=m+(num1+num2);
			
			return m;
		};
		System.out.println(calculator.add(987654, 9,"added :"));
		;
	}
}
