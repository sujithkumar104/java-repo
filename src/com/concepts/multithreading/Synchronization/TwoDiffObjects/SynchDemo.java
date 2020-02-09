package com.concepts.multithreading.Synchronization.TwoDiffObjects;

public class SynchDemo {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();
		MyThread t1 = new MyThread(d1, "Sujith");
		MyThread t2 = new MyThread(d2, "Kumar");
		t1.start();
		t2.start();
		
		// same code but if we change Display Class wish method to static synch then, it works as Class level lock
		
	}

}
