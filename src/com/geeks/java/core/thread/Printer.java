package com.geeks.java.core.thread;

public class Printer {
synchronized	void printDocuments(int number, String docName) {
		for(int i=0; i<number; i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(docName+" "+ i);
		}
	}
}
