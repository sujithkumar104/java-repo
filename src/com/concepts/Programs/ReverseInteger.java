package com.concepts.Programs;

public class ReverseInteger {
	
	private static int test(int num) {
		StringBuffer sb = new StringBuffer();
		int length = String.valueOf(num).length();
		for(int i=0;i<length;i++) {
			int temp = num%10;
			num = num/10;
			sb.append(temp);
		}
		return Integer.valueOf(sb.toString()).intValue();
	}
	
	public static void main(String[] args) {
		System.out.println(test(568));
	}

}
