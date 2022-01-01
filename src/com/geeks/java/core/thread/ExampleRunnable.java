package com.geeks.java.core.thread;

public class ExampleRunnable implements Runnable {

	public static void main(String[] args) {
		Thread T= new Thread(new ExampleRunnable());
		T.start();
			
	}

	@Override
	public void run() {
	System.out.println("Thread STarted");
		
	}

}
