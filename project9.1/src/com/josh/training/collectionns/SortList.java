package com.josh.training.collectionns;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		//create list
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(250);
		list.add(30);
		list.add(430);
		list.add(50);
		
		//ascending order
		Collections.sort(list);
		System.out.println("ascending order list="+list);
		
		//descending order
		Collections.reverse(list);
		System.out.println(" decending order list="+list);

	}

}
