package com.concepts.multithreadingPractice.join;

public class ThreadJoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
			MyThread r = new MyThread();
			Thread t1 = new Thread(r);
			t1.start();
			
			t1.join(); // main thread will execute this. main will wait till complete of t child thread..
			
			for (int i = 0; i < 10; i++) {
				System.out.println("rama thread");
			}	
	}

}
