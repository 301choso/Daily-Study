package com.tj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers2 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int[] arr=new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int B = sc.nextInt();
		int[] arr2=new int[B];
		for(int i=0;i<B;i++) {
			arr2[i]=sc.nextInt();
		}
		Arrays.sort(arr2);
		
		ArrayList<Integer> answer = new ArrayList<Integer>(); 
		int p1=0,p2=0,m=0;
		
		
		while(p1<A && p2<B) {
				if(arr[p1]==arr2[p2]) {
					answer.add(arr[p1]);
					p1++; p2++;
				}else if(arr[p1]>arr2[p2]) {
					p2++;
				}else {
					p1++;
				}
			}
	
		for(int i : answer) {
			System.out.print(i+" ");
		}

	}

}
