package com.josh.training.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class IteratorLinkedList {

	public static void main(String[] args, Consumer<? super String> element) {
		LinkedList<String> progLangs = new LinkedList<>();
		progLangs.add("c");
		progLangs.add("c++");
		progLangs.add("java");
		progLangs.add("python");
		progLangs.add("hibernate");
		
		boolean result =progLangs.contains("c");
		System.out.println("result="+ result);
		
		//find the index of the first occurence of element in linkedlist
		int index=progLangs.indexOf("java");
		System.out.println("index="+index);
		
		//find the index of the first occurence of element in linkedlist
		int lastindex=progLangs.lastIndexOf("python");
		System.out.println("lastindex="+lastindex);
		
		//iterator
	    Iterator<String> iterator=progLangs.iterator();
	    while(iterator.hasNext())
	    {
	    	String prog=(String)iterator.next();
	    	System.out.println("element="+prog);}
	    
	    //foreach advanced
	    for(String e:progLangs)
	    {
	    	System.out.println(e);
	    }
	}

}
