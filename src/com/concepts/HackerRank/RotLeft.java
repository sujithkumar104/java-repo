package com.concepts.HackerRank;

import java.util.stream.IntStream;

public class RotLeft {

	
	 static int[] rotLeft(int[] a, int d) {
         int[] newArray = new int[a.length];
         for(int i=0;i<a.length;i++) {
        	 if(d+i < a.length) {
        		 newArray[i] = a[d+i];
        	 }
         }
         System.arraycopy(a, 0, newArray, a.length-d, d);
         IntStream.of(newArray).forEach(System.out::println);
         return newArray;
    }
	 
	public static void main(String[] args) {
		System.out.println(rotLeft(new int[] {1,2,3,4,5}, 4));
	}

}
