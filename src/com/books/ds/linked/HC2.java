package com.books.ds.linked;

import java.util.*;
import java.io.*;


public class HC2 {
	static Set<Integer> nonBeautifulNumbers = new HashSet<>(Arrays.asList(2,4,16,37,58,89,145,42,20));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            
            String[] str = br.readLine().split(" ");
            int l = Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);

            long out_ = solve(l, r);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
    static long solve(int l, int r){
    	long sum = 0;
    	HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();

    	for(int i=l;i<=r;i++){
    		if(hm.containsKey(i) && hm.get(i)==true){
    			sum+=i;
    		}
    		else if(!hm.containsKey(i) && isBeautiful(i,hm) )
    		{
    		sum+=i;
    		}
    	}
    	return sum;
    }
    
    private static int sumOfDigitSquares(int num){
    	int sum =0;
    	int digit = 0;
    	while(num>1){
    		digit = num%10;
    		sum += digit*digit;
    		num = num/10;
    	}
    	return sum;
    }
    
    public static Boolean isBeautiful(int i,HashMap<Integer,Boolean> hm){

    	int cur = i;

    	if(i==0){

    	return false;

    	}

    	if(hm.containsKey(i)){

    	return hm.get(i);

    	}

    	 

    	hm.put(i,false);

    	int temp = 0;

    	while(i>0){

    	int rem = i%10;

    	temp+=rem*rem;

    	i/=10;

    	}

    	if(temp==1){

    	hm.put(cur,true);

    	return true;

    	}

    	Boolean flag = isBeautiful(temp,hm);

    	hm.put(cur,flag);

    	return flag;

    }
    
    private static boolean isBeautiful(int num){
    	//Set<Integer> nonBeautifulNumbers = new HashSet<>(Arrays.asList(2,4,16,37,58,89,145,42,20));
    	while(num!=1 && !nonBeautifulNumbers.contains(num)){
    		num = sumOfDigitSquares(num);
    	}
    	return num ==1;

    }
}
