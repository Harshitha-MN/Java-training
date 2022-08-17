package com.josh.training.collections;

import java.util.LinkedList;

public class RemoveLinkedList {
	public static void main(String[] args) {
		LinkedList<String> fruitList = new LinkedList<>();
		fruitList.add("apple");
		fruitList.add("grapes");
		fruitList.add("pineapple");
		fruitList.add("guava");
		fruitList.add("cherry");
		
		System.out.println("InitialLinkedList="+   fruitList);
		
		//remove the first element in the linkedlist
	    fruitList.removeFirst();
		System.out.println("after removing first element =>"+  fruitList);
		
		//remove the last element in the linkedlist
		fruitList.removeLast();
		System.out.println("after removing last element=>"+    fruitList);
		
		//remove first occurence of agiven element
		fruitList.remove("guava");
		System.out.println("fruitList="+ fruitList);
		
		//clear the linkedlist completely
		fruitList.clear();
		System.out.println("fruitList="+fruitList);
	}

}
