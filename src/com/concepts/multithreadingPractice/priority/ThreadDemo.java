package com.concepts.multithreadingPractice.priority;


public class ThreadDemo {
	
	
	public static void main(String[] args) {
		    // MAIN THREAD PRIORITY BY DEFULT IS 5. we can change to anything from 1 - 10
		    // MAIN THREAD CREATES CHILD THREADS -> by default child thread also will get same priority of main thread.
		
		
		    System.out.println("TEST"); // executed by main
		     // MAX IS 10
		     // MIN is 1
		    
			// MAIN THREAD
			MyThread t = new MyThread();
			t.setPriority(7);
			t.start();  // we are creating the child thread;  Main thread is creating child threa
			
			MyThread t1 = new MyThread();
			t1.setPriority(5);
			t1.start();  // we are creating the child thread;  Main thread is creating child threa
			
			
			System.out.println("Main thread: " +Thread.currentThread().getPriority());
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Parent thread");
			}
			//main thread will end here
		
		}
	}


