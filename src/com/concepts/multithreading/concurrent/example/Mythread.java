package com.concepts.multithreading.concurrent.example;

public class Mythread extends Thread{
	
	String name;
	Display d;
	
	public Mythread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	

}
