package com.concepts.multithreading.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo {
	
	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();

		lock.lock();
		lock.lock();
		
		System.out.println(lock.getHoldCount());
		System.out.println(lock.isHeldByCurrentThread());
		lock.unlock();
		
		System.out.println(lock.getHoldCount());
        System.out.println(lock.isLocked());
        System.out.println(lock.isFair());
        lock.unlock();
        System.out.println(lock.isLocked());
		
	}

}
