package com.josh.training.collections.map;

import java.util.LinkedHashMap;

public class Map2 {

	public static void main(String[] args) {
		LinkedHashMap<Object, Object> lhm = new LinkedHashMap<Object, Object>();
		//key and values are added to lhm using put(key,value)
		lhm.put(10, "banglore");
		lhm.put(12, "pune");
		lhm.put(16, "rajasthan");
		lhm.put(15, "tumkur");
		lhm.put(18, "tiptur");
		lhm.put(13, "channai");
		lhm.put(11, "ballari");
		lhm.put(null, "odissha");
		//value from lhm is retrived using get method
		System.out.println(lhm.get(null));
		System.out.println(lhm);
		System.out.println(lhm.get(12));
	}
}
