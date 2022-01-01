package com.geeks.java.core.thread;

public class Example extends Thread {
	
	public void run() {
		System.out.println("Thread Started.");
	}

	public static void main(String[] args) {
		Example ex = new Example();
		ex.start();

	}

}
