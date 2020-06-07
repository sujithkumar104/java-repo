package com.concepts.overloading;

public class VarArgs {

	public static void varargsTest(int... arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		//varargsTest(new int[] { 21, 34, 41, 22, 35 });
		//varargsTest(21,22,23);
		varargsTest(23);
	}
}
