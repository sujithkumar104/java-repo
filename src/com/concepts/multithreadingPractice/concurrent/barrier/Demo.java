package com.concepts.multithreadingPractice.concurrent.barrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(3);
		CyclicBarrier barrier = new CyclicBarrier(3);
		
		service.submit(new DependantService(barrier)); // 1st
		service.submit(new DependantService(barrier)); // 2nd
		service.submit(new DependantService(barrier)); // 3 rd


	}
	
}
