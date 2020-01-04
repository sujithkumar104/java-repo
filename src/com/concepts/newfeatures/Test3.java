package com.concepts.newfeatures;

public class Test3 {
	
	
	/* Default method are allowed in INTERFACES, if try to add we will get compile time error.
	 * default void m4() {
	 * 
	 * }
	 */
	
	
	public static void main(String[] args) {
		
		Interf1 obj = () -> {
			System.out.println("Anonomous inner class method");
		};
		
		obj.m1();
		obj.m2();
	}

}
