package com.concepts.multithreadingPractice.join;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("seetha thread");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}

	}

}
