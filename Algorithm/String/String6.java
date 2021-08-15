package com.tj;

import java.util.ArrayList;
import java.util.Scanner;

public class String6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		ArrayList<Character> al = new ArrayList<Character>();
		
		for(int i=0;i<A.length();i++) {			
						
				if(!al.contains(A.charAt(i))) {
					al.add(A.charAt(i));
				
				}				
		
		}
		String str="";
		for(int j=0;j<al.size();j++) {	
			str+=al.get(j);
		}
		System.out.println(str);
	}
}
