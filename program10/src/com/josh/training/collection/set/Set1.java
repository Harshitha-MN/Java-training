package com.josh.training.collection.set;

import java.util.TreeSet;
import java.util.Iterator;

public class Set1 {
	public static void main(String[] args) {
		TreeSet<Integer> values1 = new TreeSet<Integer>();

		System.out.println(values1.add(87));
		System.out.println(values1.add(97));
		System.out.println(values1.add(34));
		System.out.println(values1.add(92));

		System.out.println(values1);
		//check element present or not
		Iterator itr = values1.iterator();

		//print the element ,move the cursor to nextline
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
