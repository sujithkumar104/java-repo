package com.concepts.multithreadingPractice.concurrent.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService service = Executors.newFixedThreadPool(3);
		CountDownLatch latch = new CountDownLatch(3);
		
		service.submit(new DependentService(latch)); // 1st
		service.submit(new DependentService(latch)); // 2nd
		service.submit(new DependentService(latch)); // 3 rd
		
		latch.await(); // main thread will wait until latch will become 0;
		
		// main thread perform something
		System.out.println("Main thread adds the result");
		
		// exit
	}

}
