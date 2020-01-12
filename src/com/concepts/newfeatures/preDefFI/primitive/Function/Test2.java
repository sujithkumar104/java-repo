package com.concepts.newfeatures.preDefFI.primitive.Function;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntToDoubleFunction;

public class Test2 {
	
	
	public static void main(String[] args) {
		
		// Input Double ---> Return type Int
		DoubleToIntFunction di = i -> (int)i;
		System.out.println(di.applyAsInt(20.5));
		
		// DoubletoLongFunction
		//InttoDoubleFunction
		//ToIntFunction --> input anytype and return type Inttype
		
		//ToIntBiFunction -> input - anytype (2 arguments) and return type Int type
		
		IntToDoubleFunction f = i->Math.sqrt(i);
		System.out.println(f.applyAsDouble(25));
		
	}

}
