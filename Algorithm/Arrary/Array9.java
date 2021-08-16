package com.tj;

import java.util.Scanner;

public class Array9 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n+1][n+1];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][n]+=arr[i][j];
				arr[n][j]+=arr[i][j];
				
				if(i==j) {
					arr[n][n]+=arr[i][j];
				}
			}
		}
		int max=arr[n][n];
		
		
		for(int i=0;i<n;i++) {
			if(max<arr[i][n]) {
				max=arr[i][n];
			}
		}
		for(int j=0;j<n;j++) {
			if(max<arr[n][j]) {
				max=arr[n][j];
			}	
		}
		
		System.out.println(max);
	}

}
