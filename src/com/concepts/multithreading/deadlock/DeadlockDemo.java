package com.concepts.multithreading.deadlock;

public class DeadlockDemo extends Thread{
	
	A a = new A();
	B b = new B();
	
	public void m1() {
		this.start();
		a.d1(b);
	}
	
	public void run() {
		b.d2(a);
	}
	
	public static void main(String[] args) {
		DeadlockDemo d = new DeadlockDemo();
		d.m1();
	}
}
