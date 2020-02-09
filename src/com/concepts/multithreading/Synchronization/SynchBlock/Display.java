package com.concepts.multithreading.Synchronization.SynchBlock;

public class Display {
	
	public void wish(String name) {
		
		synchronized (Display.class) {
			for(int i=0;i<5;i++) {
				System.out.print("Good Mrng:");
			  try {
				  Thread.sleep(1000);
			  }catch(InterruptedException ie) {}
			  System.out.println(name);
			}
		}
   }

}
