package com.concepts.multithreadingPractice.syncronization;

public class Display {

	// requires a lock, aquring the lock
	// non static method -> object level lock is required.
	public synchronized void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Evening: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			System.out.println(name);
		}
		// releases the lock
	}
	
	// class level lock
	public static synchronized void wish1(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Good Morning: ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			System.out.println(name);
		}
		// releases the lock
	}
	
}
