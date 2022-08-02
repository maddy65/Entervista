package Reltio;

import java.util.ArrayList;

public class UnReachAbleNode {

	public static void main(String[] args) {
		int[][] edges = new int[][] {{0,2},{0,5},{2,4},{1,6},{5,4}};
		int n = 7;
		
		System.out.println(countPairs(n,edges));
	}
	
	public static long countPairs(int n, int[][] edges) {
		
        int count = 0;
        for(int i=0; i<n; i++) {
        	for(int j=i+1; j<n; j++) {
        		
        		
        		int[][] neVal = new int [][]{{i,j}};
        		
        		
        		int res = calculateReach(neVal,edges);
        		
        		if(res == 1) {
        			count = count +1;
        		}
        	}
        }
		return count;
    }

	private static int calculateReach(int[][] newVal, int[][] edges) {
		int value = 0;
		
		 for(int i = 0; i < edges.length; i++){
		        for(int j = 0; j < edges[i].length; j++){
		        	
		            if(edges[i][j] == newVal[0][0]) {
		            	value = 0;
		            	return value;
		            }
		        }
		    }
		return 1;
	}

	

}
