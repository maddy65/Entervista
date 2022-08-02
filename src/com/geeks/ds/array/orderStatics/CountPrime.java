package com.geeks.ds.array.orderStatics;

public class CountPrime {

	public static void main(String[] args) {
		int num = 10;
		int result = countPrimes(num);
		System.out.println(result);
	}
	
	 public static int countPrimes(int n) {
		 if (n <= 2) {
	            return 0;
	        }
	        
	        boolean[] primes = new boolean[n];
	        for (int i = 0; i < primes.length; i++) {
	            primes[i] = true;
	        }
	        
	        for (int i = 2; i * i < n; i++) {
	            if (primes[i]) {
	                for (int j = i * i; j < n; j += i) {
	                    primes[j] = false;
	                }
	            }
	        }
	        
	        int count = 0;
	        for (int i = 2; i < n; i++) {
	            if (primes[i]) {
	                count++;
	            }
	        }
	        
	        return count;
	 }

}
