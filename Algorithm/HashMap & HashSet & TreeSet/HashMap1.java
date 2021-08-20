package com.tj;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		String s = sc.next();
		HashMap<Character, Integer> map = new HashMap<>();
		for(Character x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);
		}
		int max=Integer.MIN_VALUE;
		char answer =' ';
		for(Character key : map.keySet()) {
			if(map.get(key)>max) {
				max=map.get(key);
				answer=key;
			}
		}
		System.out.println(answer);
	}

}
