package com.geeks.java.core.oops;

public class BoxIn {

	double width;
	double height;
	double depth;
	
	BoxIn(BoxIn Ob){
		width = Ob.width;
		height = Ob.height;
		depth = Ob.height;
	}
	
	BoxIn(double w, double h, double d){
		width = w;
		height = h;
		depth = d;
	}
	
	BoxIn(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	BoxIn(double len){
		width = height = depth = len;
	}
	
	double vol() {
		return width* height * depth;
	}
	
	
	
}
