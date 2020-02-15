package com.concepts.multithreading.InterCommunication.WithWait;

public class ThreadB extends Thread{
	
	int total = 0;

	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				total = total+i;
		    }
			this.notify();
	   }
	}
}

