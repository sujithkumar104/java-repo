package com.concepts.interviewprograms;

public class ArmStrongNumber {
	
	public static void main(String[] args) {
		int num =153;
		int length = String.valueOf(num).length();
		int sum = 0;
		for(int i =0; i<length ; i++) {
			int temp = num%10;
			sum += Math.pow(temp, length);
			num = num/10;
		}
		if(num ==sum){
			System.out.println("ArmStrong");
		}
	}

}
