package com.tj;

import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//방향키
		int [] dx ={-1,0,1,0}; //행
		int [] dy ={0,1,0,-1}; //열
		
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				boolean flag=true;
				for(int k=0;k<4;k++) {
					
					int nx = i + dx[k];
					int ny = j + dy[k];
					
					if(nx>=0 && nx<n &&ny>=0 && ny<n && arr[i][j]<=arr[nx][ny]) { 
						flag=false;
						break;
					}
					
				}
				if(flag) cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
