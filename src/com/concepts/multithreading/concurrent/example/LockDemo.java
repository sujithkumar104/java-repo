package com.concepts.multithreading.concurrent.example;

public class LockDemo {
	
	public static void main(String[] args) {
		Display d = new Display();
		
		Mythread t1 = new Mythread(d, "Sujith");
		Mythread t2 = new Mythread(d, "Kumar");
		t1.start();
		t2.start();
		
	}

}
