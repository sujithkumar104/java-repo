package com.concepts.interviewprograms;

import java.util.Arrays;

public class RevArray {

	
	public static void revArray(int[] arr) {
		int[] revArray = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			revArray[i] = arr[arr.length-1-i]; 
		}
		Arrays.stream(revArray).forEach(s -> System.out.print(" " +s));
	}
	
	 public static void main(String[] args) 
	    { 
	        int [] arr = new int[]{10, 20, 30, 40, 50}; 
	        
	        revArray(arr);
	      
	    } 
	    
}
