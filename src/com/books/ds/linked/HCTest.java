package com.books.ds.linked;
import java.io.*;
import java.util.*;


public class HCTest {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());

            String out_ = Solve(N);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static String Solve(int N){
       String yes = "Yes";
       String no = "No";
       int sum = 0;
       for(int i=1; i<N; i++) {
    	   if(N%i == 0) {
    		   if(i*i !=N) {
    			   sum = sum+i+N/i;
    		   }else {
    			   sum = sum+i;
    		   }
    		  
    	   }
       }
       if(sum == N && N !=1) {
    	   return yes;
       }else {
    	   return no;
       }
       
    }
}
