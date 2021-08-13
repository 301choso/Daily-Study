package com.tj;

import java.util.ArrayList;
import java.util.Scanner;

public class String10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.next();
		String word =sc.next();
		int[] list = new int[str.length()];
		ArrayList<Integer> index = new ArrayList<Integer>(); 
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==word.charAt(0)) {
				list[i]=0;
				index.add(i);
			}
		}
		
		
		
	}

}
