package com.tj;

import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		char word =sc.next().charAt(0);
		int[] list = new int[str.length()];
		int p=1000;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==word) {
				p=0;
				list[i]=p;
				
			}else {
				p++;
				list[i]=p;
			}
	
		}
		
		p=1000;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==word) {
				p=0;
				
			}else {
				p++;
				list[i]=Math.min(list[i],p);
			}
		}
		
		for(int k=0;k<list.length;k++) {
			System.out.print(list[k]+" ");
		}
		
	}
}
