package com.geeks.java.core.thread;

public class SyncThread extends Thread {
	Printer pref;
	
	public SyncThread(Printer p) {
		pref = p;
	}
	
	public void run() {
		pref.printDocuments(10, "John's pdf");
	}
}
