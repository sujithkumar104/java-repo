package com.concepts.newfeatures.preDefFI;

import java.util.function.Predicate;

public class Test implements Predicate<Integer>{
	
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.test(5));
		System.out.println(t.test(8));
	}

	@Override
	public boolean test(Integer i) {
		if(i%2 == 0) {
			return true;
		}
		return false;
	}

}
 // Above is converting to lamda expression like below....
// no need to write override method
class Test1{
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i%2 == 0;
		System.out.println(p.test(5));
		System.out.println(p.test(9));
		System.out.println(p.test(20));
	}
}