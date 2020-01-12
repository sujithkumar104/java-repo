package com.concepts.annomous;

public class Test4 {
	
	
	
	
	public static void main(String[] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Test1111");
				
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(
			() -> System.out.println("Test222")	
				
		);
		t2.start();
		
		
		new Thread(
			() -> System.out.println("Test333")
		).start();
		
		
	}

}
