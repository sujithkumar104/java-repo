package com.concepts.multithreadingPractice.syncronization.blocks;

public class Display {
	
	// requires a lock, aquring the lock
	// non static method -> object level lock is required.
	public void wish(String name) {

		/*
		 * for (int i = 0; i < 1; i++) { System.out.println("Some common operations"); }
		 */
		
		 synchronized (Display.class) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Evening: ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
	
				System.out.println(name);
			}
		}
			
		// releases the lock
	}

}
