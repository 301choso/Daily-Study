package com.tj;

import java.util.Scanner;

public class SlidingWindow3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int K =sc.nextInt();
		int[] n = new int[N];
		
		for(int i=0;i<N;i++) {
			n[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<K;i++) {
			sum+=n[i];
		}
		int sum2=sum;
		for(int i=K;i<N;i++) {
			sum2+=n[i];
			sum2-=n[i-K];
			if(sum2>sum) {
				sum=sum2;
			}
		}
		System.out.println(sum);
		
	}

}
