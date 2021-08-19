package com.tj;

import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n+1][6];
		
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int[] num = new int[n];

		int answer=0, max=Integer.MIN_VALUE; //-2의 31제곱
		
			for(int i=1;i<=n;i++) { //행(i번학생)
				int cnt=0;
				for(int j=1;j<=n;j++) { //열
					for(int k=1;k<=5;k++) { //학년
					if(arr[i][k]==arr[j][k]) {
						cnt++;
						break; //같은 사람 여러번 카운트하지 않도록
					}
				}
			}
			
			if(cnt>max) {
				max=cnt;
				answer=i;
			}	
		}
		
		System.out.println(answer);
	}

}
