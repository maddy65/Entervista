package com.geeks.java.core.thread;

public class ThreadTestClass extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println("Printing Second document: "+i);
		}
	}
}
