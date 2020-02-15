package com.concepts.multithreading.InterCommunication.WithOut;

public class ThreadA {
	
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(b.total);
	}

}
