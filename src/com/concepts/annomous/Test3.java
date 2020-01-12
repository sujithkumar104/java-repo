package com.concepts.annomous;

public class Test3 {
	
	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Child Anonomous Inner class");
				
			}
		};
		
		Thread t = new Thread(r);
		
		t.start();
	}

}
