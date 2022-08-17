package com.josh.training.collection.set;

import java.util.HashSet;

public class Set2 {
	public static void main(String[] args) {
		HashSet<Object> v1 = new HashSet<Object>();
		// to add the elements add method is used
		v1.add(2);
		v1.add(null);
		v1.add("java");
		v1.add(null);
		v1.add(v1);
		//// Using the remove() method
		 boolean value = v1.remove(null);
		System.out.println(v1);
		// retriving the elements using for each loop
		v1.forEach(obj -> System.out.println(obj));
	}
}
