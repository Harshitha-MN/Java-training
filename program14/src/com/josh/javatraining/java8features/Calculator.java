package com.josh.javatraining.java8features;

interface Calculator1 {
	void switchOn();
	// int subtract(int i1, int i2); with parameters
}

public class Calculator {

	public static void main(String[] args) {

		Calculator1 calculator = () -> System.out.println("switch on");
		calculator.switchOn();
		
		/*
		 * Calculator1 calculator = (i1, i2) -> i2 - i1;
		 * System.out.println(calculator.substract(8, 20));
		 */
	}
}