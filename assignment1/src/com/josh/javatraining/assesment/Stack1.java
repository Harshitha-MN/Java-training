package com.josh.javatraining.assesment;

import java.util.Stack;

import java.util.Iterator;

public class Stack1 {
	public static void main(String args[]) {

		int sum = 0;
		Stack<Integer> stk = new Stack<>();
		stk.push(1);
		stk.push(4);
		stk.push(8);
		stk.push(10);
		stk.push(19);
		stk.push(20);
		System.out.println("Elements in Stack: " + stk);

		Iterator<Integer> it = stk.iterator();
		int count = 0;
		while (it.hasNext()) {
			it.next();
			count++;
		}
		System.out.println("The size is" + count);
		System.out.println("deleted element is" + stk.pop());
		System.out.println("Elements after deleting from Stack are: " + stk);

		while (!stk.empty()) {
			sum += stk.pop();

		}
		System.out.println(sum);
	}
}
