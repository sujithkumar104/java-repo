package com.concepts.multithreadingPractice.groups;

public class Test {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		ThreadGroup g1 = new ThreadGroup("tg1");
		Thread t1 = new Thread(g1, "Thread1");
		Thread t2 = new Thread(g1, "Thread2");
		
		System.out.println(t1.getThreadGroup().getName());
		System.out.println(t1.getThreadGroup().getParent().getName());
		
		g1.list();
		
		t1.start();
		System.out.println(g1.activeCount());
		
		g1.isDaemon();
		
		

	}

}
