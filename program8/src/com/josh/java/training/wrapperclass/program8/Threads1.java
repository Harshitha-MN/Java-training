package com.josh.java.training.wrapperclass.program8;

//create a class that implements runnable interface
public class Threads1 implements Runnable {
 //override run()  to define task that should be excecuted by the thread,start the thread execution
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("code ready");
		}
	}
	public static void main(String[] args) {
		// create the object of implementation class
		Threads1 s1 = new Threads1();
		// create the object of thread class and pass implementation class object
		// reference to thread constructor
		Thread t1 = new Thread(s1);
		// use the thread class object to call start() of thread class
		t1.start();
	}
}