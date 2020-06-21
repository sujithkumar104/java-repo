package com.concepts.multithreading.InterCommunication.WithOut;

public class ThreadA {
	
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		System.out.println(b.total);
	}

}
