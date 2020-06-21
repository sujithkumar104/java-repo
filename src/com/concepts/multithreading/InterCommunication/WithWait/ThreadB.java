package com.concepts.multithreading.InterCommunication.WithWait;

public class ThreadB extends Thread{
	
	int total = 0;

	public void run() {
		synchronized (this) {
			for(int i=0;i<100;i++) {
				total = total+i;
		    }
			this.notify(); // then here also it releases the lock, but not immedialtely
			System.out.println("child thread completed");
	   }
	}
}

