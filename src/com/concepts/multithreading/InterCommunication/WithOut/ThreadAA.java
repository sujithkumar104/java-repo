package com.concepts.multithreading.InterCommunication.WithOut;

public class ThreadAA {
	
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(b.total);
	}

}
