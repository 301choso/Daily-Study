package com.tj;

import java.util.Scanner;

public class SlidingWindow5_2 {

	public static void main(String[] args) { //수학적 방법
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		
		int answer=0;
		int cnt=1; //연속된 자연수의 갯수
		N--;
		while(N>0) {
			cnt++;
			N=N-cnt;
			if(N%cnt==0) {
				answer++;
			}
		}
		System.out.println(answer);
	}

}
