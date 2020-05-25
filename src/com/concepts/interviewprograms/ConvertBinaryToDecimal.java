package com.concepts.interviewprograms;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
		int binaryValue = 1101;
		double decimal = 0;
		for(int i=0;i<4;i++) {
			 int temp = binaryValue%10;
			 decimal += temp * Math.pow(2, i);
			 binaryValue = binaryValue/10;
		}
		
		System.out.println(decimal);
	}
}
