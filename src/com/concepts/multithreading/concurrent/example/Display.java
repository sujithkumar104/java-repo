package com.concepts.multithreading.concurrent.example;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
	
    ReentrantLock lock = new ReentrantLock();
	
	public void wish(String name) {
		try {
			    lock.lock();
				for(int i=0;i<5;i++) {
				System.out.print("Good Morning: ");
				try {
					Thread.sleep(2000);
				}catch(InterruptedException ie) {}
				System.out.println(name);
			}
		}catch (Exception e) {}
		finally {
			lock.unlock();
		}
	}

}
