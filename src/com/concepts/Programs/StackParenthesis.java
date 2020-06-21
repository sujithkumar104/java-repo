package com.concepts.Programs;

import java.util.Stack;

public class StackParenthesis {

	public static String checkBalance(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if ((ch == ']' || ch == '}' || ch == ')') && (!stack.isEmpty())) {

				if (((char) stack.peek() == '(' && ch == ')') || ((char) stack.peek() == '{' && ch == '}')
						|| ((char) stack.peek() == '[' && ch == ']')) {
					stack.pop();
				} else {
					return "Not Balanced";
				}
			} else {
				if ((ch == ']' || ch == '}' || ch == ')')) {
					return "Not Balanced";
				}
			}
		}
		if (stack.isEmpty())
			return "Balanced Parenthisis";
		else
			return "Not Balanced";
	}

	public static void main(String[] args) {
		System.out.println(checkBalance("[{()}]"));
	}

}


// STACK ->LIFO   