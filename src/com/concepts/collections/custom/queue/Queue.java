package com.concepts.collections.custom.queue;

public class Queue {
	
	int size;
	int front;
	int rear;
		
	int[] queue = new int[5];
	
	
	public void enqueue(int data) {
		queue[rear] = data;
		rear++;
		size++;
	}
	
	public int dequeue() {
		int value = queue[front];
		front++;
		return value;
	}
	
	public void show() {
		for (int i = 0; i < queue.length-1; i++) {
			System.err.print(" " + queue[front+i]);
		}
	}

}
