package com.josh.training.collectionns;
import java.util.ArrayList;
import java.util.List;

public class AccessElements {

	public static void main(String[] args) {
		List<String> topprogramminglaunguages= new ArrayList<>();
		
		//check if arraylist is empty
		System.out.println("is the topprogramminglaunguages list empty:"+topprogramminglaunguages.isEmpty()); //isempty method
		
		//add elemts to the arraylist
		topprogramminglaunguages.add("java");
		topprogramminglaunguages.add("advance java");
		topprogramminglaunguages.add("html");
		topprogramminglaunguages.add("css");
		topprogramminglaunguages.add("sql");
		
		//find the size of an arraylist
		System.out.println("here are the top"+topprogramminglaunguages.size()+"programming launguages in the world");

		//retrieve the element at a given index
		String bestProgrammingLang=topprogramminglaunguages.get(0);
		System.out.println("bestProgrammingLang="+bestProgrammingLang);
		
		//modify the element at a given index
		topprogramminglaunguages.set(3, "hibernate");
		System.out.println("topprogramminglaunguages are="+topprogramminglaunguages);
	}

}
