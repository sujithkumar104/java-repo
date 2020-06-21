package com.concepts.multithreadingPractice.concurrent;

import com.concepts.multithreadingPractice.concurrent.Display;

public class MyThread extends Thread {
	
	Display d;
	String name;
	
	public MyThread(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	
	public void run() {
		try {
			d.wish(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
