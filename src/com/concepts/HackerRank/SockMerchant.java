package com.concepts.HackerRank;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	
   static int sockMerchant(int n, int[] ar) {
       Map<Integer, Integer> map = new HashMap<>();
	   
	   for(int a : ar) {
		   if(map.containsKey(a)) {
			   map.put(a, map.get(a)+1);
		   }else {
			   map.put(a, 1);
		   }
	   }
	   int count =0;
	   for(int a : map.values()) {
		   if(a > 1) {
			   count += a/2;
		   }
	   }
	   
	   return count;
	   
    }
}
