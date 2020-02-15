package com.concepts.multithreading.deadlock;

public class A {
	
	public synchronized void d1(B b) {
		System.out.println("Thread1 starts execution d1() method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {}
		System.out.println("Thread 1 trying to call B's last method");
		b.last();
	}

	public synchronized void last() {
		System.out.println("Inside A last () method");
	}
}
