package com.leetcode.ds.practice;

import java.text.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeConvert {

	public static void main(String[] args) {
		 String time1 = "02:30";
	     String time2 = "04:35";
	     System.out.println(getCount(time1,time2));
		
	  
	}
	
	private static int getCount(String time1, String time2) {
		
		 time1 = time1.replaceAll("[-+.^:,]",""); 
		 int t1 = Integer.parseInt(time1);  
		 
		 time2 = time2.replaceAll("[-+.^:,]",""); 
		 int t2 = Integer.parseInt(time2);  
		 
		 int diff = t2-t1;
		 int res = diff/60;
		 
		 if(res == 0) {
			 return 1;
		 }else {
			 return diff;
		 }
		// System.out.println(diff/60);
		 
		// System.out.println(diff);
		 //return 0;
	}

}
