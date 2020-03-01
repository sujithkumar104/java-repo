package com.concepts.spring.dependencyInjection.shape;

public class Demo {
	
	public static void main(String[] args) {
		Shape shape = FactoryMethod.getInstance("Traiangle");
		shape.draw();
	}

}
