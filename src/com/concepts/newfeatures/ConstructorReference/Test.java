package com.concepts.newfeatures.ConstructorReference;

import java.util.ArrayList;

class Sample {
	
	Sample(){
		System.out.println("Super class Consturctor");
	}
	
}

interface Interf{
	public Sample get();
}

public class Test{
	public static void main(String[] args) {
		Interf i = Sample::new;
		Sample s1 = i.get();
		Sample s2 = i.get();
		Sample s3 = i.get();
	}
}

