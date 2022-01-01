package com.geeks.java.core.thread;

public class RunnableTask extends CA  implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Runnable is running: "+i);
		}
		
	}

}
