package com.concepts.multithreadingPractice.concurrent.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class DependantService implements Runnable{
	
	CyclicBarrier barrier;
	
	public DependantService(CyclicBarrier barrier) {
		this.barrier = barrier;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				barrier.await(); // barrier // 3 thread have to come here, it will continue
				
				// perform some operations
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
}


//	RACE ->  1 thread -> 3 rounds -> thread will wait here 
//  		 2nd thread-> 3 rounds -> thread will wait here
//			 3rd thread ->  3 rounds  -> tread will wait here

//  1st round  ->  1st 30sec, 2nd -> 40sec ; 3rd -> 35
//	2nd round ->   1st 40sec, 2nd -> 30 ; 3rd -50
//	3rd round ->   1st 40sec, 2nd -> 30 ; 3rd -50
				  
	
		
