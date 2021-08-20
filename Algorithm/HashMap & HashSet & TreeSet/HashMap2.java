package com.tj;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(Character a : A.toCharArray()) {
			map.put(a,map.getOrDefault(a, 0)+1);
		}
		String answer="YES";
		for(Character b : B.toCharArray()) {
			if(!map.containsKey(b) || map.get(b)==0) {
					answer="NO";
			}else {
				map.put(b, map.get(b)-1);	
			}
			
		}
			
		System.out.println(answer); 
		
	}
}
