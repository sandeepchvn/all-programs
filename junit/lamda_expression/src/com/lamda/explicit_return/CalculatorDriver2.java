package com.lamda.explicit_return;

import java.util.Comparator;

public class CalculatorDriver2 {

	public static void main(String[] args) {
		Calculator calculator=(a,b,c)-> c+(a+b);

		System.out.println(calculator.add(78, 5, "added ="));
		;
	}
}
/* Em id,name email,phone ,pass > list - Comparator */