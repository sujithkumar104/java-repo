package com.concepts.multithreadingPractice.runnable;

public class Test {

	public static void main(String[] args) {

		// MAIN THREAD
		System.out.println(Thread.currentThread().getName());

		
		  MyRunnable r = new MyRunnable(); 
		   Thread t1 = new Thread(r); 
		   t1.start(); // new child thread will be created -> main is executing this.
		   //t1.run();   // no new thread and compiles fine, but run method would be invoked by main thread// it will call target.run();
		  // r.start(); // compilation error
		    //r.run();    // normal method call   
		  
		  Thread t2 = new Thread();
		  t2.start(); // new thread will be created and it will call run method of thread claass and nothing will execute and thread
		  t2.run();   // it will execute run method thread and nothing will execute
		  
		  
		 
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent thread");
		}
		// main thread will end here
	}

}
