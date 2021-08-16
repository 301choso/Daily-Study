package com.tj;

import java.util.Scanner;

public class Array8 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] arr2=new int[n];
		
		
		for(int i=0;i<n;i++) {
			int rank=1;
			
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {			
					rank++;
				}
			}
			arr2[i]=rank;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr2[i]+" ");
		}
	}

}
