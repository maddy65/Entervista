package com.geeks.java.core.oops;

public class BoxOverload {
	double width;
	double height;
	double length;
	BoxOverload(double w, double h, double l){
		width = w;
		height = h;
		length = l;
	}
	BoxOverload(){
		width = -1;
		height = -1;
		length = -1;
	}
	BoxOverload(double len){
		width = height = length = len;
	}
	
	double volume() {
		return width * height * length;
	}
	
}