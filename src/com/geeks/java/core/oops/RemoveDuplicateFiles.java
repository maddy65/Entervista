package com.geeks.java.core.oops;

import java.io.*;
import java.util.*;

public class RemoveDuplicateFiles {

	public static void main(String[] args) throws Exception{
		String filepath = "D://input.txt";
		String input = null;
		Scanner sc = new Scanner(new File(filepath));
		FileWriter writer = new FileWriter("D://output.txt");
		Set set = new HashSet();
		while (sc.hasNextLine()) {
	         input = sc.nextLine();
	         if(set.add(input)) {
	            writer.append(input+"\n");
	         }
	      }
	      writer.flush();
	      System.out.println("Contents added............");
	}

}
