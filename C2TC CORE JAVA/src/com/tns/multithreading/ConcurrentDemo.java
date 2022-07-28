//Concurrency program (Lock Interface method)


package com.tns.multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class ConcurrentDemo {

	public static void main(String[] args) {
		
		ReentrantLock l = new ReentrantLock();  //Object 1
		
		l.lock();
		
		System.out.println(l.isLocked()); //to check object is locked or not
		
		//l.unlock();
		
		System.out.println(l.isHeldByCurrentThread()); //TO check current thread is holding the lock or not
		
		System.out.println(l.getHoldCount()); // how many locks in objects 
		
		System.out.println(l.getQueueLength()); //how many other threads are waiting
		

	}

}
