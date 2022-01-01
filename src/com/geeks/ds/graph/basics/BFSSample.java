package com.geeks.ds.graph.basics;
import java.io.*;
import java.util.*;

public class BFSSample {
	private int V;
	private LinkedList<Integer> adj[];
	
	BFSSample(int v){
		V = v;
		adj = new LinkedList[v];
		
		for(int i=0; i<v; i++) {
			adj[i] = new LinkedList();
		}
	}
	
	
}
