package com.concepts.multithreadingPractice.concurrent.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		MyCallable[] jobs = { new MyCallable(10), new MyCallable(20), new MyCallable(30), new MyCallable(40),
				new MyCallable(50), new MyCallable(60),

		};

		ExecutorService service = Executors.newFixedThreadPool(3);

		/*
		 * Future result1 = service.submit(new MyCallable(20)); Future result2 =
		 * service.submit(new MyCallable(30));
		 * 
		 * System.out.println(result1.get()); System.out.println(result2.get());
		 */

		for (MyCallable job : jobs) {
			Future result = service.submit(job);
			System.out.println(result.get());
		}

		service.shutdown();

	}

}
