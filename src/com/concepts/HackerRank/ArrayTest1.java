package com.concepts.HackerRank;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayTest1 {
	
	
	static int simpleArraySum(int[] ar) {
	       int sum = 0;
	       System.out.println(ar.length);
	       for(int i=0;i<ar.length;i++){
	           sum = sum + ar[i];
	       }
	       return sum;
	    }
	
	static int simpleArraySumJava8(int[] ar) {
	       return IntStream.of(ar).sum();
	}
	
	
		static void plusMinus(int[] arr) {
	        int divideBy = arr.length;
	        int positive =0;
	        int negitive =0;
	        int zeros = 0;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i] > 0){
	                 positive++;   
	            }else if(arr[i] < 0){
	               negitive++;
	            }else{
	               zeros++; 
	            }
	        }

	        System.out.println((double)positive/(double)divideBy);
	        System.out.println((double)negitive/(double)divideBy);
	        System.out.println((double)zeros/(double)divideBy);
	
	}
	
	
	static int[] simpleArraySortedJava8(int[] ar) {
	       return IntStream.of(ar).sorted().toArray();
	}
	
	public static void main(String[] args) {
		int[] ar = new int[] {1, 2, 3, 11, 10, 4};
		
		System.out.println(simpleArraySum(ar));
		System.out.println(simpleArraySumJava8(ar));
		int[] sorted = simpleArraySortedJava8(ar);
		Arrays.stream(sorted).forEach(System.out::println);
	}

}
