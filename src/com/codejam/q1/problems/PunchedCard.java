package com.codejam.q1.problems;

import java.util.Scanner;

class PunchedCard {
	public static void printANCII(int r, int c){

		for(int i=0; i<(r*2 +1); i++){
			boolean flag = true;
			for(int j=0; j<(c*2+1); j++){
				if(i%2 != 0){
					if(i<2 && j<2){
						System.out.print(".");
					}else{
						if(flag){
							System.out.print("|");
							flag = false;
						}else{
							System.out.print(".");
							flag = true;
						}
					}
				}else{
					if(i<2 && j<2){
						System.out.print(".");
					}else{
						if(flag){
							System.out.print("+");
							flag = false;
						}else{
							System.out.print("-");
							flag = true;
						}
					}
				}
			}
			System.out.println("");
		}
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int test = in.nextInt();

		for(int i=1; i<=test; i++){
			int row = in.nextInt();
			int coloum = in.nextInt();
			System.out.println("Case #"+i+":");
			printANCII(row,coloum);
		}
	}
}
