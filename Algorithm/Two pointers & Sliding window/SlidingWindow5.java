package com.tj;

import java.util.Scanner;

public class SlidingWindow5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] arr=new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i]=i;
		}
		
		int lt=0,cnt=0,sum=0;
		for(int rt=0;rt<N;rt++) {
			sum+=arr[rt]; //원하는 수보다 작으면 오른쪽을 이동(더하기)
			
			if(sum==N) { // 원하는 수와 같으면 카운트
				cnt++;
			}
			
			while(sum>=N) { //원하는 수보다 같거나 크면 왼쪽을 이동(빼기)
				sum-=arr[lt++];
				if(sum==N) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}

}
