package com.josh.java.training.program8;

//create a class that extends threads class 
public class Threads2 extends Thread {
	/*
	 * Overreide run() to define the task should be executed by the thread..start
	 * the thread execution
	 */
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("extending thread class method");
		}
	}

	public static void main(String[] args) {
		// create the object of subclass
		Threads2 th2 = new Threads2();
		// use the subclass object to call start() of thread class
		th2.start();
	}
}
