package com.tj;

import java.util.Scanner;

public class SlidingWindow4 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int M =sc.nextInt();
		int[] n = new int[N];
		
		for(int i=0;i<N;i++) {
			n[i]=sc.nextInt();
		}
		
		int sum=0,cnt=0,lt=0;
		for(int rt=0;rt<N;rt++) {
			sum+=n[rt];
			if(sum==M) {
				cnt++;
			}
			while(sum>=M) {
				sum-=n[lt++];
				if(sum==M) {
					cnt++;
				}
			}
		}
			
		System.out.println(cnt);
	}

}
