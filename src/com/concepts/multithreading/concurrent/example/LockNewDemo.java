package com.concepts.multithreading.concurrent.example;

public class LockNewDemo {
	
	Display d = new Display();
	
	public void runThread() {
		
		Runnable r1 = () -> {
			d.wish("Sujith");
		};
		
		Runnable r2 = () -> {
			d.wish("Kumar");
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}
	
	public void runAnother() {
		
		new Thread(
			() -> d.wish("Sujith")
		).start();
		
		new Thread(
				() -> d.wish("Kumar")
				).start();
		
	}
	
	
	public static void main(String[] args) {
			
		LockNewDemo l = new LockNewDemo();
		//l.runThread();
		l.runAnother();
		
	}

}
