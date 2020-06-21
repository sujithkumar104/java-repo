package com.concepts.multithreadingPractice.runnable;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// executed by child thread...
		
		Thread.currentThread().setName("Sujith Child thread");
		System.out.println(Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
		// child thread will end here...

	}

}
