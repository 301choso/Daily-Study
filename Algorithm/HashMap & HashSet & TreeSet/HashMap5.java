package com.tj;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class HashMap5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int[] arr = new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=sc.nextInt();
		}	
		
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0;i<A;i++) {
			for(int j=i+1;j<A;j++) {
				for(int l=j+1;l<A;l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}
			}
		}
		int cnt=0,answer=-1;
		for(int x:Tset) {
			cnt++;
			if(cnt==B) {
				answer=x;
			}
		}
		System.out.println(answer);
		
	}
}
