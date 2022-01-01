package com.geeks.java.core.oops;

public class Shipment extends BoxWeight {
	 double cost;
	 
	 Shipment(Shipment Ob) {
		super(Ob);
		cost = Ob.cost;
	}
	 
	 Shipment(double w, double h, double d, double m, double c){
			super(w,h,d,m);
			cost = c;
		}
}
