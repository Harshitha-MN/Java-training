package com.josh.training.collectionns;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DiffWaysToIterateArrayList {
	public static void main(String[] args) {
		List<String>courses=Arrays.asList("c","c++","java","spring","hibernate");
		
		//basic for loop
		for(int i=0;i<courses.size();i++) {
			System.out.println("courses.get(i)="+courses.get(i));
		}
		//enhanced for each loop
		for(String course:courses)
		{
			System.out.println("course="+course);
		}
		//basic loop with iterator
		for(Iterator<String> Iterator=courses.iterator();Iterator.hasNext();)
		{
			String course=(String)Iterator.next();
			System.out.println("course="+course);
		}
		//java 8 stream +lambda example
		courses.stream().forEach(course->System.out.println("course="+course));
		
		//java 8 forEach+lambda
		courses.forEach((course)->System.out.println("course="+course));
	}

}
