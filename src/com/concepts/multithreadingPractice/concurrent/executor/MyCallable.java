package com.concepts.multithreadingPractice.concurrent.executor;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

	int num;

	public MyCallable(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {

		System.out.println(" Job started By Thread:" + Thread.currentThread().getName());

		Thread.sleep(1000);
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println(" Job completed By Thread:" + Thread.currentThread().getName());

		return sum;
	}

}
