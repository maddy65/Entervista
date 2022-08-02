package com.codejam.q1.problems;
import java.util.*;


class prb {
	 public static void solve(int[] p1, int[] p2, int[] p3){
	  int sum =0;
	  int[] result = new int[4];
	  for(int i=0; i<p1.length; i++){
	   int small = Math.min(Math.min(p1[i],p2[i]),p3[i]);
	   sum += small;
	   result[i] = small;
	  }
	  if(sum == 1000000){
	   for(int i: result){
	    System.out.print(i+" ");
	   }
	  }else{
	   System.out.println("IMPOSSIBLE");
	  }
	 }


	 public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);

	  int test = in.nextInt();
	  // System.out.println(300000+200000+300000+200000);

	  for(int i=0; i<test; i++){

	   int[] p1 = new int[4];
	   int[] p2 = new int[4];
	   int[] p3 = new int[4];

	   for(int j=0; j<4; j++){
	    p1[j] = in.nextInt();
	   }

	   for(int j=0; j<4; j++){
	    p2[j] = in.nextInt();
	   }

	   for(int j=0; j<4; j++){
	    p3[j] = in.nextInt();
	   }

	   solve(p1,p2,p3);
	  }
	 }
	}
