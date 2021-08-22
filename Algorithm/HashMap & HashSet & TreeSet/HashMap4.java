package com.tj;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		
		HashMap<Character,Integer> origMap = new HashMap<>();
		for(Character str : T.toCharArray()) {
			origMap.put(str, origMap.getOrDefault(str, 0)+1);
		}
		
		int lt=0,cnt=0;
		for(int rt=T.length();rt<=S.length();rt++) { //rt 증가
			int sum=0;
			
			HashMap<Character,Integer> map = new HashMap<>(origMap);
		
			for(int i=lt;i<rt;i++) { //lt 회전
			
				if(map.containsKey(S.charAt(i)) && map.get(S.charAt(i)) !=0) {
					map.put(S.charAt(i), map.get(S.charAt(i))-1);
		
				}else {
					break;
				}
				
			}
			
			for(Integer num : map.values()){
				sum+=num;
			}
			if(sum==0) {
				cnt++;
			}
		
			lt++;
		}
		
		System.out.println(cnt);
	}

}
