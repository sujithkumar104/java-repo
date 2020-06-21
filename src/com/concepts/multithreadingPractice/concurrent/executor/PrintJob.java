package com.concepts.multithreadingPractice.concurrent.executor;

import java.util.concurrent.Callable;

public class PrintJob implements Callable<Object> {
	
	String name;
	public PrintJob(String name) {
		this.name = name;
	}

	@Override
	public Object call() throws Exception {
		
		System.out.println(name + " Job started By Thread:" + Thread.currentThread().getName());
		
		try {
			Thread.sleep(1000);
			// print steps
		}catch(InterruptedException ie) {}
		
		System.out.println(name + " Job completed By Thread:" + Thread.currentThread().getName());
		return name;

		
	}

}
