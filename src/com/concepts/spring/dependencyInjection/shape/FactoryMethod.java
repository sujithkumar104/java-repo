package com.concepts.spring.dependencyInjection.shape;

public class FactoryMethod {
	
	public static Shape getInstance(String shape) {
		if(shape.equalsIgnoreCase("Traiangle")) {
			return new Traingle();
		}else if(shape.equalsIgnoreCase("Circle")) {
			return new Circle();
		}
		return null;
	}

}
