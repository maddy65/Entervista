package com.geeks.java.core.oops;

public class Box2 {
	
	static double width;
	static double height;
	static double depth;
	
	Box2(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	
	public static void main(String[] args) {
		Box2 bt = new Box2(depth, width, height);
	}
}
