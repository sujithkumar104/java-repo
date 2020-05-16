package com.concepts.HackerRank;

public class Kangaroo {

	static String kangaroo(int x1, int v1, int x2, int v2) {
			if(x2 > x1 && v2 > v1) {
				return "NO";
			}else {
				int i=1;
				while (true) {
					if(((x1+v1) + v1*i) == ((x2+v2) + v2*i)){
						return "YES";
					}
					if(i == 10000) {
						return "NO";
					}
					i++;
					
				}
			}
	}
	
	static String kangarooOptim(int x1, int v1, int x2, int v2) {
        if (v1 > v2) {
			
			int remainder = (x1 - x2) % (v2 - v1);
			
			if (remainder == 0) {
				return "YES";
			}
		}
		return "NO";
	}

	public static void main(String[] args) {
		   System.out.println(kangarooOptim(0, 3, 4, 2));
	}

}
