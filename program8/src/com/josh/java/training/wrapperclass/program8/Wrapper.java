package com.josh.java.training.wrapperclass.program8;

public class Wrapper {
	public static void main(String[] args) {
		// boxing process using constructors
		Integer obj1 = new Integer(123);
		// integere in the form of string
		Integer obj2 = new Integer("1283");

		// boxing process using valueof() method
		Integer obj3 = Integer.valueOf(123);
		Integer obj4 = Integer.valueOf("564");

		System.out.println("after boxing process");
		System.out.println("obj1=" + obj1);
		System.out.println("obj2=" + obj2);
		System.out.println("obj3=" + obj3);
		System.out.println("obj4=" + obj4);

		// unboxing process
		int a = obj1.intValue();
		String s1 = obj2.toString();
		int b = obj3.intValue();
		String s2 = obj4.toString();

		System.out.println("after unboxing");
		System.out.println("a=" + a);
		System.out.println("a1=" + s1);
		System.out.println("b=" + b);
		System.out.println("a2=" + s2);
	}
}