package com.tj;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a1=1;
		int a2=1;
		int a3;
		System.out.print(a1);
		System.out.print(" "+a2);
		for(int i=0;i<n-2;i++) {
			a3=a1+a2;
			System.out.print(" "+a3);
			
			a1=a2;
			a2=a3;
		}
		

	}

}
