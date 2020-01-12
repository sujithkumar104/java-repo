package com.concepts.newfeatures;

public class Test4 implements Left, Right{

	public void m1() {
		Left.super.m1();
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		t.m1();
	}

}
