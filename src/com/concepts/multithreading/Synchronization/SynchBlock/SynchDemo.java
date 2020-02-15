package com.concepts.multithreading.Synchronization.SynchBlock;

public class SynchDemo {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "Sujith");
		MyThread t2 = new MyThread(d2, "Kumar");
		t1.start();
		t2.start();
		
		// If we keep synch(this) current object, then it is based on object level lock, result: inconsistent results.
		// If we keep synch(Display.class), then it becomes like class level lock, then result would be consistent results.
	}

}
