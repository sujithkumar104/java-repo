package com.concepts.designpatterns.bridgepattern;

public class Traingle implements Shape {

	private Color color;

	@Override
	public void applyColor() {
		System.out.print("Applying Color to Triangle: ");
		color.applyColor();
	}

	public Traingle(Color color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawn Traingle");
	}

}
