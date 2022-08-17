package com.josh.training.collections.map;

import java.util.HashMap;

public class Map1 {
	public static void main(String[] args) {
		HashMap<Object,Object>hm=new HashMap<Object,Object>();
		hm.put(1, "harshi");
		hm.put(4, "aishui");
		hm.put(2, "priyai");
		hm.put(3, "ranui");
		hm.put(1, "arshi");
		hm.put(null, "account");
		hm.put(7, "harshi");
		hm.put(6, "harshd");
		System.out.println(hm);
		System.out.println(hm.get(null));  //fetch the value of null key
	}
}
