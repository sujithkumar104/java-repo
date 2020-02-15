package com.concepts.multithreading.deadlock;

public class B {
	
	public synchronized void d2(A a) {
		System.out.println("Thread1 starts execution d2() method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException ie) {}
		System.out.println("Thread 1 trying to call B's last method");
		a.last();
	}
	
	public synchronized void last() {
		System.out.println("Inside B last() method");
	}

}
