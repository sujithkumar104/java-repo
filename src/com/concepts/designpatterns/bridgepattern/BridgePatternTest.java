package com.concepts.designpatterns.bridgepattern;

public class BridgePatternTest {
	
	public static void main(String[] args) {
		Shape tri = new Traingle(new RedColor());
		tri.draw();
		tri.applyColor();
		
		Shape sq = new Sqaure(new BlueColor());
		sq.draw();
		sq.applyColor();
	}

}
