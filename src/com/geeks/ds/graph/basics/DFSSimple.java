package com.geeks.ds.graph.basics;
import java.util.*;
import java.io.*;

public class DFSSimple {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	DFSSimple (int v){
		V = v;
		adj = new LinkedList[v];
		for(int i=0; i<v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	
	void dfs(int s) {
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>(); 

		visited[s]=true; 
		queue.add(s); 

		while (queue.size() != 0) 
		{ 
			s = queue.poll(); 
			System.out.print(s+" "); 

			Iterator<Integer> i = adj[s].listIterator(); 
			while (i.hasNext()) 
			{ 
				int n = i.next(); 
				if (!visited[n]) 
				{ 
					visited[n] = true; 
					queue.add(n); 
				} 
			} 
		} 
	}
	

	public static void main(String[] args) {
		DFSSimple ds = new DFSSimple(4);
		ds.addEdge(0, 1);
		ds.addEdge(0, 2);
		ds.addEdge(1, 2);
		ds.addEdge(2, 0);
		ds.addEdge(2, 3);
		ds.addEdge(3, 3);
		
		System.out.println("Vertix 2");
		
		ds.dfs(2);
	}

}
