package com.concepts.multithreading.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;


public class MyThread extends Thread{
	
   static ReentrantLock lock = new ReentrantLock();
	
	MyThread(String name){
		super(name);
	}
	
	public void run() {
		try {
			if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
				try {
					for(int i=0;i<5;i++) {
						System.out.println("Thread performing the opertions: " + Thread.currentThread().getName());
						try {
							Thread.sleep(2000);
						}catch(InterruptedException ie) {}
					}
				}	
				finally {
					lock.unlock();
				}
			}else {
				for(int i=0;i<5;i++) {
					System.out.println("Thread performing other opertions: " + Thread.currentThread().getName());
					try {
						Thread.sleep(2000);
					}catch(InterruptedException ie) {}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
}
