package com.concepts.multithreadingPractice.basics;

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		// MAIN THREAD
		System.out.println(Thread.currentThread().getName());
		
		
		MyThread t = new MyThread();
		t.start();  // we are creating the child thread;  Main thread is creating child thread.
		
		
		/*
		 * Thread t1 = new Thread(t); t1.start();
		 */
			
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent thread");
		}
		//main thread will end here
		// all the demaon threads will be also be ternmiated..
	
	}

}
