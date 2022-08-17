package com.josh.java.training.program8;

class Counter {
	int count;

	/*
	 * if we are not make our method as synchronized thar means our method,object is
	 * not thread safe and also it does not give correct value.
	 */
	public synchronized void increment() {
		count++; // count = count + 1
	}
}

public class Synchronous {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		/*
		 * c.increment(); c.increment(); here how many times we want to print count that
		 * times we need to write so that instead of doing that create object for thread
		 */
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}

			}
		});
		t1.start();
		t2.start();
		t1.join(); // asking our main thread to wait for t1 to complte its job
		t2.join();

		System.out.println("Count " + c.count);
	}
}
