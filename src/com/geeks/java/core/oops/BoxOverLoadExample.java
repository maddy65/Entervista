package com.geeks.java.core.oops;

public class BoxOverLoadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxOverload myBox1 = new BoxOverload(10, 20, 15);
		BoxOverload myBox2 = new BoxOverload();
		BoxOverload myBox3 = new BoxOverload(7);
		
		double vol;
		
		vol = myBox1.volume();
		System.out.println("my Box1 volume: "+vol);
		
		vol = myBox2.volume();
		System.out.println("my Box2 volume: "+vol);
		
		vol = myBox3.volume();
		System.out.println("my Box3 volume: "+vol);
	}

}
