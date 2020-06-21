package com.concepts.multithreadingPractice.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Display {

	Lock lock = new ReentrantLock();

	// longest waiting will get chance to execute

	public void wish(String name) throws InterruptedException {
		try {
			lock.lock();
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Evening: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}

				System.out.println(name);
			}
		}
		finally {
			lock.unlock(); // releasing the lock
		}
	}
	
	
}
