package com.concepts.designpatterns.singletondesign;

public class MySingleTonLazy {
	
	private static MySingleTonLazy obj;
	
	private MySingleTonLazy() {
		
	}
	
	public static MySingleTonLazy getObj() {
		if(obj == null) {
			synchronized (MySingleTonLazy.class) {
				if(obj == null) {
					return new MySingleTonLazy();
				}
			}
		} 
		return obj;
	}

}
