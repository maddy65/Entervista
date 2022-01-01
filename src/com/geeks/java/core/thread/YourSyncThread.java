package com.geeks.java.core.thread;

public class YourSyncThread extends Thread {
	
	Printer ypref;
	YourSyncThread (Printer pr){
		ypref = pr;
	}
	
	public void run() {
		ypref.printDocuments(10, "Alex Profile");
	}
}
