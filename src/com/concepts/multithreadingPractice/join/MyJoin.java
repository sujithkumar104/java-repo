package com.concepts.multithreadingPractice.join;

public class MyJoin implements Runnable {

	public static Thread mainThread;

	@Override
	public void run() {

		try {
			mainThread.join(); // this will be executed by child thread. child thread will go into waiting state..
		} catch (InterruptedException e) {
			System.out.println("I got intreuppted");
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("seetha thread");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("I got intreuppted");
			}
		}

	}

}
