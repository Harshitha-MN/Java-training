package com.josh.javatraining.java8features;

import java.util.StringJoiner;

public class StringJoiner1 {
	public static void main(String[] args) {
		/*
		 * Passing comma(,) as delimiter and opening bracket "(" as prefix and closing
		 * bracket ")" as suffix
		 */
		StringJoiner mystring = new StringJoiner(",", "(", ")");

		// Joining multiple strings by using add() method
		mystring.add("Negan");
		mystring.add("Rick");
		mystring.add("Maggie");
		mystring.add("Daryl");

		System.out.println(mystring);
	}
}