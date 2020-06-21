package com.concepts.multithreadingPractice.syncronization.blocks;

import com.concepts.multithreadingPractice.syncronization.blocks.Display;

public class Mythread extends Thread{

	Display d;
	String name;
	
	public Mythread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		d.wish(name);
	}
	

}
