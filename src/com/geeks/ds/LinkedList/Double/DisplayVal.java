package com.geeks.ds.LinkedList.Double;

public class DisplayVal {

	public static void main(String[] args) {
		//displayClosestToTen(8, 11);
	    //displayClosestToTen(7, 14);
	    displayClosestToTen(7, 13);

	}
	
	public static void displayClosestToTen(int a, int b) {
	    int x = 10 - a;
	    int y = 10 - b;
	    int z = abs(y);
	    
	    System.out.println(z);
	    if (x < z){
	        System.out.println(a);
	    }
	    else if (x > z) {
	        System.out.println(b);
	    }
	    else{
	        System.out.println(b);

	    }

	}

	public static int abs(int a) {
	    if (a < 0) {
	        return -a;
	    } else {
	        return a;
	    }
	}

}
