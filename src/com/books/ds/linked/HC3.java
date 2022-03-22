package com.books.ds.linked;
import java.io.*;
import java.util.*;

public class HC3 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         String[] line = br.readLine().split(" ");
         int n = Integer.parseInt(line[0]);
         int t = Integer.parseInt(line[1]);  
         int[][] task = new int[n][2];
         for(int i_task = 0; i_task < n; i_task++)
         {
            String[] arr_task = br.readLine().split(" ");
            for(int j_task = 0; j_task < arr_task.length; j_task++)
            {
                task[i_task][j_task] = Integer.parseInt(arr_task[j_task]);
            }
         }

         int out_ = solve(n, t, task);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int n, int t, int[][] task){
    	PriorityQueue<Integer> pQueue= new PriorityQueue(Collections.reverseOrder());
    	  // Arrays.sort(task,Comparator.comparingInt(o->o[0]));
    	   int pQueueSum=0;
    	   int max=0;
    	   for(int i=0;i<n;i++){
    	       int totalTime =t;
    	       int distance = 2*task[i][0];
    	       int remainingTime=totalTime-distance;
    	       int currEffort=task[i][1];
    	       if(remainingTime<0){
    	           break;
    	       }
    	       while(pQueueSum>remainingTime){
    	           pQueueSum-=pQueue.poll();
    	       }
    	       if(pQueue.isEmpty()&&remainingTime>currEffort){
    	         pQueue.add(currEffort);
    	         pQueueSum+=currEffort;  
    	       }
    	       else if(pQueueSum+currEffort<=remainingTime){
    	           pQueue.add(currEffort);
    	           pQueueSum+=currEffort;
    	       }
    	       else{
    	           Integer currMax=pQueue.peek();
    	           if(currMax != null && currMax>currEffort){
    	               pQueue.poll();
    	               pQueue.add(currEffort);
    	               pQueueSum=pQueueSum-currMax+currEffort;
    	           }
    	       }
    	       max=Math.max(max,pQueue.size());
    	   }
    	return max;
    
    }

}
