package com.concepts.newfeatures.preDefFI.primitive.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;

public class Test {
	
	public static void main(String[] args) {
		
		// input type Double and Return type void
		DoubleConsumer d = i->System.out.println("Hello "+ i);
		d.accept(50.0);
		
		ObjDoubleConsumer<Double> od = (a,b) -> System.out.println("Hello " + a*b); 
		od.accept(50.0, 2.5);
	}

}
