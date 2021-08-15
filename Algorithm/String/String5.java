package com.tj;

import java.util.Scanner;

public class String5 {
	public static String main2(char[] B) {
		String str="";
		for(int i=0;i<B.length;i++) {
			str+=B[i];
		}
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		char[] B = new char[A.length()];
		
		for(int k=0;k<A.length();k++) {
			B[k]=A.charAt(k);
		}
		int cnt =B.length/2;
		for(int i=0;i<cnt;i++) {
			char temp=' ';
			if((B[i]>=65 && B[i]<=90) || (B[i]>=97 && B[i]<=122))  {
			
				temp=B[i];
				B[i]=B[B.length-1-i];
				B[B.length-1-i]=temp;
			}
		}
		
		main2(B);
	}

}
