package com.concepts.multithreading;


class Mythread extends Thread{
	
	public void run() {
		System.out.println("Child Thread: "+Thread.currentThread().getPriority());
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
	}
}

public class Test {
	
	public static void main(String[] args) {
		Mythread t = new Mythread();
		t.setPriority(10);
		t.start();
		System.out.println("Main Thread: "+Thread.currentThread().getPriority());
	}
	
}
