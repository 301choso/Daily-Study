package com.tj;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int answer=0;
		int cnt=1;
		if(arr[0]==1) {
			answer+=1;
		}
		
		
		for(int i=1;i<n;i++) {
			if(arr[i]==1) {
				if(arr[i-1]>=1) {
					cnt++;
					answer+=cnt;
				}else {
					answer+=1;
					cnt++;
				}
				
			}else{
				
				cnt=0;
			}
		}
		
		System.out.print(answer);
	}

}
