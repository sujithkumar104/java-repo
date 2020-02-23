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
		     
		     try {
		    	 Thread.sleep(5000);
		     }catch(InterruptedException ie) {}
		     
		     MySingleTonLazy obj4 = MySingleTonLazy.getObj();
		     
		     if(obj3 == obj4) {
		    	 System.out.println("EQUAL");
		     }else {
		    	 System.out.println("NOT EQUAL");
		     }
		     
	}

}
