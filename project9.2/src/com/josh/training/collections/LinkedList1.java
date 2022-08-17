package com.josh.training.collections;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("pineapple");

		System.out.println("initial linkedlist->" + fruits);

		// adding an element at the specifiedposition in the linkedlist
		fruits.add(1, "watermelon");
		System.out.println("after adding watermelon =>" + fruits);

		// adding an element at the begining of the linkedlist
		fruits.addFirst("strawberry");
		System.out.println("after adding strawberry=>" + fruits);

		// adding an element at the end of the linkedlist
		fruits.addLast("orange");
		System.out.println("after adding orange=>" + fruits);
	}
}
