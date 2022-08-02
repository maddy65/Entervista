package Walmart;

public class Findclosest {

	public static void main(String[] args) {
		int nums[] = {-4,-2,1,4,8};
		//System.out.println(findClosestNumber(nums));
		
		int total = 20;
		int cost1 = 10;
		int cost2 = 5;
		
		System.out.println(waysToBuyPensPencils(total,cost1,cost2));
	}
	
	public static long waysToBuyPensPencils(int total, int cost1, int cost2) {
		if(total < cost1 && total < cost2) {
			return 1;
		}
		long ways = 0;
		int i = 0;
		long maxtemp = cost1 > cost2 ? cost1 : cost2; 
		long mintemp = cost1 < cost2 ? cost1 : cost2;
		while(i <= total/maxtemp) {
			long tempTotal = total - (maxtemp*i);
			long tempWays = (tempTotal/mintemp) +1;
			ways = ways+tempWays;
			i = i+1;
		}
		return ways;
    }
	
	public static int findClosestNumber(int[] arr) {
	        int closestIndex = 0;
	        int diff = Integer.MAX_VALUE;
	        for (int i = 0; i < arr.length; ++i) {
	            int abs = Math.abs(arr[i]);
	            if (abs < diff) {
	                closestIndex = i;
	                diff = abs;
	            } else if (abs == diff && arr[i] > 0 && arr[closestIndex] < 0) {
	                closestIndex =i;
	            }
	        }  
	        return arr[closestIndex ];
	}
}
