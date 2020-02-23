package com.concepts.designpatterns.bridgepattern;

public class Sqaure implements Shape {

	private Color color;

	@Override
	public void applyColor() {
		System.out.print("Applying Color to Square: ");
		color.applyColor();
	}

	public Sqaure(Color color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawn Square");
	}

}
