package com.concepts.designpatterns.producerConsumer;

import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueDemo {
	
	// Using Blocking Queue
	
	public static String createItem() {
		
		String item = "Sujith";
		Date date = new Date();
		item += date.toString();
		return item;
	}
	
	public static void process(String item) {
		System.out.println(item);
	}
	
	public static void main(String[] args) {
		
		 BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
		 
		 final Runnable producer = () ->{
			 	while(true) {
			 		try {
						queue.put(createItem());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 	}
		 };
		 
		 final Runnable consumer = () -> {
			 	while(true) {
			 		try {
						String item = queue.take();
						process(item);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			 	}
		 };
		 
		 
		 new Thread(producer).start();
		 new Thread(consumer).start();
	}
	

}
