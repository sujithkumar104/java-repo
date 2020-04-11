package com.concepts.overriding;

import java.io.IOException;

public class Test {

	
	public static void main(String[] args) throws IOException {
		Parent p = new Parent();
		
		p.m1();
		
		Child c = new Child();
		
		c.m1();
		
		Parent p1  = new Child();
		p1.m1();
	}
}
