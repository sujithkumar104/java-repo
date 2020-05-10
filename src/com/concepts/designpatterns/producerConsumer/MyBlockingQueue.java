package com.concepts.designpatterns.producerConsumer;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;


public class MyBlockingQueue {
	
	private int max;
	
	private Queue<String> queue = new LinkedList<>();
	
	private ReentrantLock lock = new ReentrantLock();
	
	private Condition empty = lock.newCondition();
	
	private Condition full = lock.newCondition();
	
	
	public MyBlockingQueue(int size) {
		queue = new LinkedList<>();
		this.max=size;
	}
	
	public void put(String s) throws InterruptedException {
		lock.lock();
		try {
		    while(queue.size() == max) {
		    	full.wait();
		    }
		    queue.add(new Date().toString());
		    empty.signalAll();
		}finally {
	    	lock.unlock();
	    }
	}
	
	public String take() throws InterruptedException {
		lock.lock();
		String item;
		try {
			while(queue.size() == 0) {
				empty.await();
			}
			item = queue.remove();
			full.signalAll();
			return item;
		}finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		MyBlockingQueue queue1 = new MyBlockingQueue(10);
		//same code as BlockingQueue code...
		
	}
	

}
