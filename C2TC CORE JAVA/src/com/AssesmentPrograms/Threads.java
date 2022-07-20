//Thread using Runnable interface

package com.AssesmentPrograms;

class MyThread implements Runnable
{

	@Override
	public void run() {
	
		for(int i=0; i<=5; i++)
		
		{
	        System.out.println(i);
		}
	}
}


public class Threads {

	public static void main(String[] args) {
        MyThread t = new MyThread(); // t is object 
        
        Thread s = new Thread(t);
        
        s.start();// start your thread
        
        
	}

}

	
	
