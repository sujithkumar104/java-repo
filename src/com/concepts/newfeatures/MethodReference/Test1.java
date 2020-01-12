package com.concepts.newfeatures.MethodReference;

public class Test1 {
	
	public static void sum(int x, int y) {
		System.out.println("The Sum "+(x*y));
		System.out.println("X * Y multiply "+(x*y));
	}

	public static void main(String[] args) {
		Interf i = (a, b) -> System.out.println("The Sum: "+ (a+b));
		i.add(50, 100);
		
		Interf i1 = Test1::sum;
		i1.add(100, 200);
	}
}
