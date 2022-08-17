package com.josh.training.collection.set;

import java.util.LinkedHashSet;

public class Set3 {

	public static void main(String[] args) {
		LinkedHashSet<Object> LH = new LinkedHashSet<Object>();
		LH.add(2);
		LH.add(null);
		LH.add("harshi");
		LH.add("tads");
		LH.add("amma");
		LH.add(LH);
		LH.add(2);

		System.out.println(LH);
		LH.forEach(obj -> System.out.println(obj));
	}
}
