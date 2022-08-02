package Reltio;

import java.util.Arrays;

public class Bus {

	public static void main(String[] args) {
		/*int[] buses = new  int[]{20,10,30}; 
		int[] passengers = new int[] {19,13,26,4,25,11,21};*/
		
		int[] buses = new  int[]{10,20}; 
		int[] passengers = new int[] {2,17,18,19};
		
		
		int capacity =2;
		latestTimeCatchTheBus( buses,  passengers, capacity); 
	}
	
	public static int  latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
		
		
		 Arrays.sort(buses);
		 Arrays.sort(passengers);
		 
		
		 int pasg = 0;
		 
		 for(int i=0; i<buses.length; i++) {
			 int newCap = capacity;
			 for(int j=pasg; j<passengers.length; j++) {
				if(newCap != 0 && passengers[j] <= buses[i]) {
					
					pasg = pasg +1;
					newCap = newCap -1;
					
				}
			 }
		 }
		 
		 
		 pasg = pasg-1;
		 System.out.println(pasg);
		 System.out.println( passengers[pasg]);
		 
		 
		 int leastNum = passengers[pasg]-1;
		
		System.out.println(leastNum);
        return 0;
    }
}
