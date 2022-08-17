package com.josh.training.collections;

import java.util.LinkedList;

public class RetriveLinkedList {
	public static void main(String[] args) {
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("pineapple");
		fruits.add("grapes");
		fruits.add("cherry");

		// getting the first element using getFirst()
		String firstelement = fruits.getFirst();
		System.out.println("firstelement=>" + firstelement);

		// getting the last element in the linkedlist using getLast()
		String lastElement = fruits.getLast();
		System.out.println("lastElement=>" + lastElement);

		// getting the element at a given position in linkedlist
		String element = fruits.get(1);
		System.out.println("element" + element);

		for (String element1 : fruits) {
			System.out.println("element=" + element1);
		}
	}
}
