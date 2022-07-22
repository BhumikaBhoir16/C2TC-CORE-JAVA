//Demo on Synchronization

package com.tns.core.java.multithreading;

class Counter
{
	int count;
	
	public synchronized void inc(){
		{
			count++;
		}
	}


public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		Counter c= new Counter();
		
		//first thread
		
		Thread t1 = new Thread(new Runnable()
				{
			     public void run() {
			    	 for (int i=1;i<=10000;i++)
			    	 {
			    		 c.inc();
			    		 
			    	 }
			     }
				
				});
		//second thread
		
		Thread t2 = new Thread(new Runnable()
				{
			
			public void run() {
				for (int i=1;i<=10000;i++)
				{
					c.inc();
				}
			}
				
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(c.count);
	}
	}
}


