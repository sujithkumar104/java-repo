package com.concepts.multithreading;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getName());
		
		System.out.println(Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		
		System.out.println(Thread.currentThread().getPriority());
		
		new Thread(
			() -> {
				Thread.currentThread().setPriority(4);
				System.out.println(Thread.currentThread().getName());
				System.out.println(Thread.currentThread().getPriority());
			}).start();

	}
	
	
}
