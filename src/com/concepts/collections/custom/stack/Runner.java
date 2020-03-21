package com.concepts.collections.custom.stack;

public class Runner {

	
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.show();
		stack.push(20);
		stack.show();
		stack.push(40);
		stack.show();
        stack.push(50);
        stack.show();
        stack.push(60);
        stack.show();
        stack.push(80);
        stack.show();
        stack.show();
		
		/*System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		System.out.println(stack.isEmpty());
		stack.pop();
		System.out.println(stack.isEmpty());

		stack.show();*/
	}
}
