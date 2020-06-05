package com.concepts.newfeatures;

@FunctionalInterface
public interface Interf {

	public int add(int a, int b);
	
	public static void m1() {
		System.out.println("Static Methods");
	}
	
     default void m5() {
    	 System.out.println("Default Method");
     }
}
