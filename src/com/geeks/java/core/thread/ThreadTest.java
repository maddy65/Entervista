package com.geeks.java.core.thread;

public class ThreadTest {

	public static void main(String[] args) {
		// Job1
		System.out.println("Application Start");
		
		// Job 2
		ThreadTestClass tc = new ThreadTestClass();// Child Thread
		tc.start();
		
		//Job 3
		for(int i=0; i<10; i++) {
			System.out.println("Document is Printing : "+i);
		}
		
		
		// Job4
		
		Runnable rtc = new RunnableTask();
		Thread task = new Thread(rtc);
		task.start();
		// Job 5
		System.out.println("Application Stops");
		

	}

}
