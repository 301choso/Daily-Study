package com.tj;

import java.util.Scanner;

public class String9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(!Character.isLetter(str.charAt(i))) {
				str2+=str.charAt(i);
			}
		}
		System.out.println(Integer.parseInt(str2));
	}
}
