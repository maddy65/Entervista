package com.geeks.java.core.oops;

public class BoxWeight extends BoxIn{

	double weight;
	
	BoxWeight(BoxWeight Ob){
		super(Ob);
		weight = Ob.weight;
	}
	 
	BoxWeight(double w, double h, double d, double m){
		/*width = w;
		height = h;
		depth = d;*/
		super(w,h,d);
		weight = m;
	}
	
	BoxWeight(){
		super();
		weight = -1;
	}
	
	BoxWeight(double len, double m){
		super(len);
		weight = m;
	}

}
