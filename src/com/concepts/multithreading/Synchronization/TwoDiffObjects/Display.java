package com.concepts.multithreading.Synchronization.TwoDiffObjects;

public class Display {

	public static synchronized void wish(String name) {
		for(int i=0;i<5;i++) {
			System.out.print("Good Mrng:");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException ie) {}
			System.out.println(name);
		}
	    
	}
	
}
