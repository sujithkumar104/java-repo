package com.concepts.multithreading.InterCommunication.WithWait;

public class ThreadA {
	
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start(); // scehdular is taking 1 sec to call run method
		synchronized (b) {
			System.out.println("Main Thread Trying to call wait method");
			b.wait(); // it immediately releaes the lock, waiting state
			System.out.println("Main Thread got notification");
			System.out.println(b.total);
		}
	}

}
