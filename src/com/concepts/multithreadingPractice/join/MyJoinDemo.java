package com.concepts.multithreadingPractice.join;

public class MyJoinDemo {

	public static void main(String[] args) throws InterruptedException {
		MyJoin.mainThread = Thread.currentThread(); // main thread

		MyJoin r = new MyJoin();
		Thread t1 = new Thread(r);
		t1.start();

		
		for (int i = 0; i < 10; i++) {
			System.out.println("rama thread");
			
		}
		t1.interrupt(); // by main thread 
		
		System.out.println("End of main");

	}
}
