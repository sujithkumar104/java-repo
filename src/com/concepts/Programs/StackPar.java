package com.concepts.Programs;

import java.util.Stack;

public class StackPar {

	public static String checkBalanced(String str) {
		char[] charArray = str.toCharArray();

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < charArray.length; i++) {
			char ch = charArray[i];
			if (ch == '{' || ch == '[' || ch == '(') {
				stack.push(ch);
			} else if (!stack.isEmpty() && (stack.peek() == '{' && ch == '}' || stack.peek() == '[' && ch == ']'
					|| stack.peek() == '(' && ch == ')')) {
				stack.pop();
			} else if (ch == ']' || ch == '}' || ch == ')') {
				return "Not balanced";
			}
		}

		if (!stack.isEmpty()) {
			return "Not Balacned";
		}
		return "Balanced";

	}

	public static void main(String[] args) {
		System.out.println(checkBalanced("{[]}"));
	}
}
