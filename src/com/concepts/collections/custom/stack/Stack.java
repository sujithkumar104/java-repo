package com.concepts.collections.custom.stack;

public class Stack {

	int capacity = 2;
	int[] stack = new int[capacity];

	int top = 0;

	public void push(int value) {
		if (size() == capacity) {
			expand();
		}
		stack[top] = value;
		top++;

	}

	public int size() {
		return top;
	}

	private void expand() {
		int length = size();
		capacity = capacity * 2;
		int[] newstack = new int[capacity];
		System.arraycopy(stack, 0, newstack, 0, length);
		stack = newstack;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("STACK IS EMPTY");
		} else {
			top--;
			int data = stack[top];
			stack[top] = 0;
			return data;
		}
		return 0;
	}

	public int peek() {
		int data = stack[top - 1];
		return data;
	}

	public boolean isEmpty() {
		return top <= 0;
	}

	public void show() {
		for (int i : stack) {
			System.out.print(" " + i);
		}
		System.out.println();
	}

}
