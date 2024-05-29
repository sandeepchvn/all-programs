package com.lamda;

public class AnimalLamda {
	public static void main(String[] args) {
		Animal animal = () -> {
			System.out.println("eats chicken biryani");
		};
		animal.eat();
	}
}
