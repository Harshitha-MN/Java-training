package com.josh.javatraining.java8features;

//Java program with Optional Class

import java.util.Optional;

public class Optional1 {
	public static void main(String[] args) {
		Optional<String> GOT = Optional.of("Game of Thrones");
		/*
		 * Filter returns an empty Optional instance if the output doesn't contain any
		 * value, else it returns the Optional object of the given value.
		 */
		System.out.println(GOT.filter(s -> s.equals("GAME OF THRONES")));
		System.out.println(GOT.filter(s -> s.equalsIgnoreCase("GAME OF THRONES")));
	}
}
