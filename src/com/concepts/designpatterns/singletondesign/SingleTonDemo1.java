package com.concepts.designpatterns.singletondesign;

public class SingleTonDemo1 {
	
	
	public static void main(String[] args) {
		     MySingleTon obj = MySingleTon.getObj();
		     
		     MySingleTon obj2 = MySingleTon.getObj();
		     
		     if(obj == obj2) {
		    	 System.out.println("EQUAL");
		     }else {
		    	 System.out.println("NOT EQUAL");
		     }
		     
		     MySingleTonLazy obj3 = MySingleTonLazy.getObj();
		     	     
		     MySingleTonLazy obj4 = MySingleTonLazy.getObj();
		     
		     if(obj3 == obj4) {
		    	 System.out.println("EQUAL");
		     }else {
		    	 System.out.println("NOT EQUAL");
		     }
		     
	}

}
