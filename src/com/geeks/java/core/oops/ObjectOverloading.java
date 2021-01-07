package com.geeks.java.core.oops;

public class ObjectOverloading {
	int a,b;
	
	public ObjectOverloading(int i, int j) {
		a = i;
		b = j;
	}
	
	boolean equalTo(ObjectOverloading T) {
		if(T.a == a && T.b == b) {
			return true;
		}
		return false;
	}
}
