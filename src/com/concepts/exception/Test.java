package com.concepts.exception;

class Main extends Exception { 
	
	/*
	 * Main(String msg){ super(msg); }
	 */
}

class Test {
   public static void main(String args[]) throws Main{ 
      try {
         throw new Main();
      }
		/*
		 * catch(Main t) { System.out.println("Got the Main Exception"); }
		 */
      finally {
         System.out.println("Inside finally block ");
      }
  }
}
