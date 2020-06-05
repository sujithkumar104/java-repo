package com.concepts.HackerRank;

public class Valley {

	 static int countingValleys(int n, String s) {
		 int count=0;
		 int altitube = 0;
		 
		 char[] charArray = s.toCharArray();
		 
		 for(char ch: charArray) {
			  if(ch == 'U') {
				  if(altitube==-1) {
					  count++;
				  }
				  altitube++;
			  }
			  else {
				  altitube--;
			  }
		 }
		 
		 return count;

	 }
	
	
	public static void main(String[] args) {
		
	}
}
