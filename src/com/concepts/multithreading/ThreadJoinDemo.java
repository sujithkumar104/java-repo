package com.concepts.multithreading;

class Mythread1 extends Thread{
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Seetha Thread");
		try {
			Thread.sleep(2000);
		}catch(Exception e) {}
		}
	}
	
}



public class ThreadJoinDemo {
	
	public static void main(String[] args) throws InterruptedException {
		Mythread1 t = new Mythread1();
		t.start();
		t.join();
		
		for(int i=0;i<5;i++) {
			System.out.println("Rama Thread");
		}
	}
	
	
	

}
