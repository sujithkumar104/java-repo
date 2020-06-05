package com.concepts.newfeatures;

public class Test1 {	
	
	public static void main(String[] args) {
		Interf i = (a, b) -> a+b;
		System.out.println(i.add(5, 10));
		i.m5();
	}

}
