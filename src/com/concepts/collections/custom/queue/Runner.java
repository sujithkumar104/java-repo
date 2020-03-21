package com.concepts.collections.custom.queue;

public class Runner {
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.dequeue();
		queue.dequeue();
		queue.show();
	}

}
