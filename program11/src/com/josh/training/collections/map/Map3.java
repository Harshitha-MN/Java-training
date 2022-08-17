package com.josh.training.collections.map;

import java.util.TreeMap;

public class Map3 {

	public static void main(String[] args) {
		TreeMap<Integer, String> TM = new TreeMap<Integer, String>();
		TM.put(1, "abc");
		TM.put(9, "bcd");
		TM.put(1, "bed");
		TM.put(1, "xyz");
		TM.put(4, "null");
		TM.put(5, "null");
		TM.put(1, "5");
		System.out.println(TM.get(9));
		System.out.println(TM);
	}
}
