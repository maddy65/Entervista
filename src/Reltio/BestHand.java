package Reltio;

import java.util.Arrays;

public class BestHand {

	public static void main(String[] args) {
		int[] rank = new  int[]{10,10,2,12,9}; 
		char[] suits = new  char[]{'a','b','c','a','d'}; 
		bestHand(rank,suits);

	}
	
	
	public static  String bestHand(int[] ranks, char[] suits) {
		String type1 = "Flush";
		String type2 =  "Three of a Kind";
		String type3 = "Pair";
		String type4 = "High Card";
		String resultType = "";
		
		char matchChar = suits[0];
		boolean suitsflg = true;
		for(int i=1; i<suits.length; i++) {
			if(matchChar != suits[i]) {
				suitsflg = false;
				break;
			}
		}
		int resCount = 1;
		if(suitsflg) {
			resultType = type1;
			
		}else {
			 boolean visited[] = new boolean[ranks.length];
		     Arrays.fill(visited, false);
		     for (int i = 0; i < ranks.length; i++) {
		    	  
		         if (visited[i] == true)
		             continue;
		   
		         int count = 1;
		         for (int j = i + 1; j < ranks.length; j++) {
		             if (ranks[i] == ranks[j]) {
		                 visited[j] = true;
		                 count++;
		             }
		         }
		         if(count >= 3) {
		        	 resCount = 3;
		        	 break;
		         }else if(count == 2){
		        	 resCount = 2;
		         }else {
		        	 if(resCount != 2) {
		        		 
		        		 resCount = 1;
		        	 }
		         }
		       
		     }
		     
		     if(resCount == 2) {
		    	 resultType = type3;
		     }else if(resCount == 3) {
		    	 resultType = type2;
		     }else {
		    	 resultType = type4;
		     }
		}
		
		
		//System.out.println(resultType);
		return resultType;
	}
}
