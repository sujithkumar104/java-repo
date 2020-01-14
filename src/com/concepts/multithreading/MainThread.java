package com.concepts.multithreading;

class MyThread2 extends Thread{
	
	public static Thread mainThreadRef;
	
	public void run() {
		
		try {
			mainThreadRef.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("Child thread");
		}
	}
	
}


public class MainThread {
	
	
	public static void main(String[] args) {
		MyThread2.mainThreadRef = Thread.currentThread();
		MyThread2 t = new MyThread2();
		t.start();
		
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {}
		
		for(int i=0;i<5;i++) {
			System.out.println("Main thread");
		}
	}

}
