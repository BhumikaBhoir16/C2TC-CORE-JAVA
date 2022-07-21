//creating thread using Extends Thread class

package com.AssesmentPrograms;

class MyThread1 extends Thread{
	@Override
	public void run() {
	//thread1	
		int i = 0;
		
		while(i<10) {
			
			System.out.println("Creating a Thread using extends thread");
			
			i++;
		}
		//sleep method always put try catch block
		try {
			
			Thread.sleep(2000);  //here 2000 is 2000 mili sec
			
		} 
		catch (InterruptedException e) {
			
		}
			
		}
	}


public class ThreadDemo extends Thread {
	public static void main(String[]args) throws InterruptedException {
		
		MyThread1 t1 = new MyThread1();
		ThreadDemo t2 = new ThreadDemo();
		t1.start();
		t1.join(3000);   //3000 mili sec
		
		//thread2
	    int i = 0;
		while(i<10) {
			
			System.out.println("And other method to create a thread is implementing Runnable interface");
			
			i++;
	}

}
}
