package com.concepts.multithreadingPractice.concurrent.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		 PrintJob[] jobs = { new PrintJob("Sujith"),
				 			 new PrintJob("Kumar"),
				 			 new PrintJob("Sujit"),
				 			 new PrintJob("Patsani"),
				 			 new PrintJob("Ravi"),
				 			 new PrintJob("Shiva"),
				 			};
			
		 
		ExecutorService service = Executors.newFixedThreadPool(3); //
		
		for(PrintJob job  : jobs) {
			Future r = service.submit(job);
			//System.out.println(r.get());
		}
		
		service.shutdown();
		 
		 
	}

}
