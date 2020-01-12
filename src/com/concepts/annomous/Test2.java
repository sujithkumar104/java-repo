package com.concepts.annomous;

public class Test2{
		
    public static void main(String[] args) {
		
		A t = new A(){
			public void m1() {
				System.out.println("M1 Anonomous Method Implementation");
			}
			public void m2() {
				System.out.println("M2 Anonomous Method Implementation");
			}
		};
		
		t.m1();
		t.m2();
		
	}

}
