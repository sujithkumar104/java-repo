package com.concepts.multithreadingPractice.basics;

public class MyThread extends Thread{
	
	
	public void run() {
		// executed by child thread...
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		// child thread will end here...
	}
	
	
}
