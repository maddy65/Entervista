package com.codejam.q1.problems;

public class maxResult {

	public static void main(String[] args) {
		//String str = "1231";
		//String str = "2998589353917872714814599237991174513476623756395992135212546127959342974628712329595771672911914471";
		//char digit = '1';
		char digit = '3';
		System.out.println(removeDigit(str,digit));

	}
	
	public static String removeDigit(String number, char digit) {
	    long result = 0;
	    for(int i = 0; i<number.length(); i++) {
	    	char num = number.charAt(i);
	    	if(num == digit) {
	    		String myStr = number.substring(0, i) + number.substring(i + 1); 
	    		try{
	    			long myNum = Long.parseLong(myStr);  
	    			if(myNum > result) {
	    				result = myNum;
	    			}
	            }
	            catch (NumberFormatException ex){
	                ex.printStackTrace();
	            }
	    	}
	     }
	    String s = String.valueOf(result);  
		return s;
	}

}
