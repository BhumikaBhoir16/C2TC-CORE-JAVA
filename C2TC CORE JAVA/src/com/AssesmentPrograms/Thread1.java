//Create thread using Runnable interface - 1st technique

package com.AssesmentPrograms;

/*		class MyThreads implements Runnable
		{

			@Override
			public void run() {
	//thread 1		
				for(int i=0; i<=5; i++)
				
				{
			        System.out.println("Ram");
				}
			}
		}


		public class Thread1 {

			public static void main(String[] args) {
				
				 MyThreads t = new MyThreads(); // t is object 
			        
			        Thread s = new Thread(t);
			        
			        s.start();
	//thread 2	         
		         for(int i=0; i<=10;i++)
		         {
		        	 System.out.println("Sham");
		        	 
		         }
		         }
		        
		// here we can not predict the output       
	}*/



// Create thread using Extends thread - 2nd technique

class ExThread extends Thread   // thread
{
	public void run()
   {
		for(int j=0; j<=20; j++)
		{
	
	     System.out.println(j);
	      Thread.yield();  // using yield method this thread give chance to other thread to execute first
        }

   }
}

//Thread Scheduler

public class Thread1{
	
	public static void main(String[]args) {
		
		ExThread s = new ExThread();
		s.start();
		
		for(int j=0; j<=10; j++)
		{
			System.out.println("Nima");
		}
	}
}
			