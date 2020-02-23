package com.concepts.designpatterns.singletondesign;

public class MySingleTonLazy {
	
	private static MySingleTonLazy obj;
	
	private MySingleTonLazy() {
		
	}
	
	public static MySingleTonLazy getObj() {
		if(obj == null) {
			synchronized (MySingleTonLazy.class) {
				if(obj == null) {
					obj = new MySingleTonLazy();
				}
			}
		} 
		return obj;
	}

}
