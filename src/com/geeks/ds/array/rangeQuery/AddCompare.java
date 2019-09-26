package com.geeks.ds.array.rangeQuery;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class AddCompare {
	
	public static void printLargest(Vector<String> myArr) {
		Collections.sort(myArr, new Comparator<String>() {
		@Override
		public int compare(String X, String Y) {
			String XY = X+Y;
			String YX = Y+X;
			return XY.compareTo(YX) > 0 ? -1:1;
		}
		});
	
	
		Iterator it  = myArr.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
	

	public static void main(String[] args) {
		Vector<String> myArr = new Vector<>();
		myArr.add("54");
		myArr.add("546"); 
		myArr.add("548"); 
		myArr.add("60"); 
		printLargest(myArr); 
	}

}
