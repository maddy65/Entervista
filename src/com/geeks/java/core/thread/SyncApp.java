package com.geeks.java.core.thread;

public class SyncApp {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("== Application Started =="); 
		
		Printer pi = new Printer();
		pi.printDocuments(10,"Som.pdf");
		
		SyncThread st = new SyncThread(pi);
		st.start();
		//st.join();
		
		YourSyncThread yrf = new YourSyncThread(pi);
		yrf.start();
	
		System.out.println("== Application Ending. ==");

	}

}
