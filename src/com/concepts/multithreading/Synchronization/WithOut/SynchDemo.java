package com.concepts.multithreading.Synchronization.WithOut;

public class SynchDemo {
	
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Sujith");
		MyThread t2 = new MyThread(d, "Kumar");
		t1.start();
		t2.start();
	}

}
