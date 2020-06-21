package com.concepts.multithreadingPractice.syncronization.blocks;

import com.concepts.multithreadingPractice.syncronization.blocks.Display;
import com.concepts.multithreadingPractice.syncronization.blocks.Mythread;

public class SynchDemo {
	
	public static void main(String[] args) {
		Display d1 = new Display();
		Display d2 = new Display();

		Mythread t1 = new Mythread(d1, "Sujith");
		Mythread t2 = new Mythread(d2, "Kumar");

		t1.start();
		t2.start();
	}


}
