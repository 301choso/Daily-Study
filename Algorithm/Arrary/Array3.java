package com.tj;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] A = new String[n]; 
		String[] B = new String[n]; 
		
		for(int i=0;i<n;i++) {
			A[i]=sc.next();
			
		}
		
		for(int i=0;i<n;i++) {
			B[i]=sc.next();
			
		}
		
		for(int i=0;i<n;i++) {
		
			if(A[i].equals(B[i])) { //비김
				System.out.println("D");
			}else{
				if(A[i].equals("1")) { 
					if(B[i].equals("2")) { 
						System.out.println("B");
					}else {
						System.out.println("A");
					}
				}else if(A[i].equals("2")) {
					if(B[i].equals("1")) { 
						System.out.println("A");
					}else {
						System.out.println("B");
					}
				}else {
					if(B[i].equals("1")) { 
						System.out.println("B");
					}else {
						System.out.println("A");
					}
				}
			}
		}
		
		
	}

}
