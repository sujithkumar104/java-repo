package com.concepts.multithreading.concurrent.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		
		 new Thread(() -> {
				try{
					lock.lock();
				for (int i=0;i<10;i++) {
					System.out.println("Child Thread");
				}
				}finally {
					lock.unlock();
				}
			}).start();
			
			for (int i=0;i<10;i++) {
				System.out.println("Main Thread");
			}
			
		
	}

}
