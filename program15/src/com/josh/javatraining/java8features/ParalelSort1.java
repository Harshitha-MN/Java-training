package com.josh.javatraining.java8features;

import java.util.Arrays;

public class ParalelSort1 {
	public static void main(String[] args) {
		int numbers[] = { 34,31,13,23,54,82 };
		Arrays.parallelSort(numbers);
		// converting the array to stream and displaying using forEach
		Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));
	}
}
