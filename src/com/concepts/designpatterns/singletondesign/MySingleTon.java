package com.concepts.designpatterns.singletondesign;

public class MySingleTon {
	
	private static MySingleTon obj = new MySingleTon(); // EARLY INSTATIATION
	
	private MySingleTon() {
		
	}
	
	public static MySingleTon getObj() {
		return obj;
	}
	

}
