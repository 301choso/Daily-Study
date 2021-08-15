package com.tj;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n]; 
		
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		int max=0;int cnt=0;
		for(int i=0;i<n;i++) {
			if(max<array[i]) {
				max=array[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
