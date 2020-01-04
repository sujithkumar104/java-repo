package com.concepts.newfeatures;

public interface Interf1 {
	
	public void m1();
	
	default void m2() {
		System.out.println("Default method implementation");
	}

}
