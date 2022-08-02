package com.codejam.q1.problems;

public class SwapPair {

	public static void main(String[] args) {
		int num = 1234;
		int num2 = 65875;
		int num3 = 0;
		System.out.println(largestInteger(num3));

	}
	
	
	 public static int largestInteger(int number) {
		 String str = (new Integer(number)).toString();
	    char[] chArr = str.toCharArray();
	    int[] arr = new int[chArr.length];
	    for (int i = 0; i< chArr.length; i++) {
	        arr[i] = Character.getNumericValue(chArr[i]);
	    }
	    
	    if(arr.length == 1) {
	    	return number;
	    }
	    
	    int first = Integer.MIN_VALUE;
	    int second = Integer.MIN_VALUE;
	    int firstPos =0;
	    int SecondPos =0;
	    
	    for(int i = 0; i < arr.length; i++){
		      if(arr[i] > first){
		        second = first;
		        first = arr[i];
		      }else if(arr[i] > second){
		        second = arr[i];
		        System.out.println();
		      }		
		}
	    
	    for(int i=0;i<arr.length;i++) {
	        if(arr[i] == first) {
	        	firstPos = i;
	        }
	        if(arr[i] == second) {
	        	SecondPos = i;
	        }
	    }
	    
	    if((firstPos+1 )%2 == 0) {
	    	int temp = arr[0];
		    arr[0] = arr[SecondPos];
		    arr[SecondPos] = temp;
		    
		    int secondtemp = arr[1];
		    arr[1] = arr[firstPos];
		    arr[firstPos] = secondtemp;
	    }else {
	    	int temp = arr[0];
		    arr[0] = arr[firstPos];
		    arr[firstPos] = temp;
		    
		    int secondtemp = arr[1];
		    arr[1] = arr[SecondPos];
		    arr[SecondPos] = secondtemp;
	    }
	    

	    
	    int res = 0;
	    for(int i=0;i<arr.length;i++) {
	         res=res*10+arr[i];
	    }
	    return res;

	}
}
