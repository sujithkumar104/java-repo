package com.concepts.multithreading.InterCommunication.WithWait;

public class ThreadA {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
		synchronized (b) {
			System.out.println("Main Thread Trying to call wait method");
			b.wait();
			System.out.println("Main Thread got notification");
			System.out.println(b.total);
		}
	}

}
