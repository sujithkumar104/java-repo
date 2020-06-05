package com.concepts.HackerRank;

public class RepString {

	static long repeatedString(String s, long n) {
		StringBuilder reString = new StringBuilder(s);
		while (true) {
			if (reString.length() >= n) {
				break;
			} else {
				reString.append(s);
			}

		}

		String finalString = reString.toString().substring(0, (int) n);
		return 0;
	}

	static long repeatedStringOptimzed(String line, long n) {
		long acount = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'a')
				acount++;
		}
		long grp = n / line.length();
		long rem = n % line.length();
		acount = grp * acount;
		for (int i = 0; i < rem; i++) {
			if (line.charAt(i) == 'a')
				acount++;
		}
		return acount;
	}


	static long repeatedStringOptimzed1(String s, long n) {
		
		StringBuilder reString = new StringBuilder(s);
		while (true) {
			if (reString.length() >= n) {
				break;
			} else {
				reString.append(s);
			}

		}

		String line = reString.toString().substring(0, (int) n);
		
		long acount = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'a')
				acount++;
		}
		
		return acount;
	}
	
	public static void main(String[] args) {
		System.out.println(repeatedString("aba", 10));
		System.out.println(repeatedStringOptimzed("aba",10));
		System.out.println(repeatedStringOptimzed1("aba",10));

	}

}
