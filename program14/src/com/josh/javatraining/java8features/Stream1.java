package com.josh.javatraining.java8features;

import java.util.*;

class Stream1 {

	public static void main(String[] args) {

		// Creating a list of Integers
		List<Integer> list = Arrays.asList(3, 4, 6, 125, 20);

		// Using Stream filter(Predicate predicate)
		list.stream().filter(num -> num % 5 == 0).forEach(System.out::println);
	}
}
