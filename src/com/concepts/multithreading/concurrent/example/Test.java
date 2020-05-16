package com.concepts.multithreading.concurrent.example;

public class Test {

	
	public static void main(String[] args) {
		int i=0;
		int j=0;
		
		int a = i++; // assign and increment
		int b = ++j; // increment and assign
		
		System.out.println(a);
		System.out.println(b);
	}
}
