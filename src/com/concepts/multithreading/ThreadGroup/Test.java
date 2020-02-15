package com.concepts.multithreading.ThreadGroup;

public class Test {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		ThreadGroup g1 = new ThreadGroup("tg");
		Thread t1 = new Thread(g1, "First Thread");
		Thread t2 = new Thread(g1, "Second Thread");
		//g1.setMaxPriority(3);
		
		g1.setMaxPriority(7);
		
		Thread t3 = new Thread(g1, "Third Thread");
		System.out.println(t1.getPriority()); // 5
		System.out.println(t2.getPriority()); // 5
		System.out.println(t3.getPriority()); // 3 or 5 based on priority set above
		
		
		
	}

}
