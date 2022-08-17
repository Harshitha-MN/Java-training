package com.josh.training.collectionns;
import java.util.ArrayList;
import java.util.List;

public class RemoveElementsArraList {

	public static void main(String[] args) {
		List<String> fruits=new ArrayList<>();
		
		//adding new elements to the arraylist
		fruits.add("banana");
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("pineapple");
		fruits.add("grapes");
		
		System.out.println("fruits="+fruits);
		
		fruits.remove(4);
		System.out.println("after removing element at index 4 ="+fruits);
		
		fruits.remove("mango");
		System.out.println("after removing mangofrom the index ="+fruits);
		
		//remove all the elements that exixt in a given collection
		List<String> subfruitsList =new ArrayList<>();
		subfruitsList.add("apple");
		subfruitsList .add("banana");
		
		fruits.removeAll(subfruitsList);
		System.out.println("fruits="+fruits);
		
		//clear method
		fruits.clear();
		System.out.println("fruits="+fruits);
		
		
		
	}

}
