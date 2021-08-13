package com.tj;

import java.util.Scanner;

public class String4 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	String[] str = new String[A];
	String[] strs = new String[A];
	
	for(int i=0;i<A;i++) {
		str[i] = sc.next();
		strs[i]=""; //초기화의 중요성, 안하면 null 값이 남는다.
		for(int k=str[i].length()-1;k>=0;k--) {
			
			strs[i] +=str[i].charAt(k);
		}
	
	}
	for(int k=0;k<A;k++) {
		System.out.println(strs[k]);
	}
	
		
		
	}
}
