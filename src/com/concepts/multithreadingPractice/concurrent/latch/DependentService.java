package com.concepts.multithreadingPractice.concurrent.latch;

import java.util.concurrent.CountDownLatch;

public class DependentService implements Runnable{
	
	CountDownLatch latch;
	
	public DependentService(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
		// some operation
		
		latch.countDown(); // completed its execution  3 -> 2 ->1 -> 0
	}
	
	

}
