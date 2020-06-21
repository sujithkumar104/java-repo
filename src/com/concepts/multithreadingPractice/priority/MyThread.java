package com.concepts.multithreadingPractice.priority;

public class MyThread extends Thread{
	
	public void run() {
		// executed by child thread...
		System.out.println("Child Thread : "+ Thread.currentThread().getPriority());

		Thread.yield();

		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
		// child thread will end here...
	}

}
