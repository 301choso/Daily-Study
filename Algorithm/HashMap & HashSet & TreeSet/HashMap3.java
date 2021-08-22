package com.tj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMap3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int[] arr = new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=sc.nextInt();
		}	
		
		HashMap<Integer,Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<B;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}	
		list.add(map.size());
		
		int lt=0;
		for(int rt=B;rt<arr.length;rt++) {
			map.put(arr[lt], map.getOrDefault(arr[lt], 0)-1);
			if(map.get(arr[lt])==0) {
				map.remove(arr[lt]);
				}
			map.put(arr[rt], map.getOrDefault(arr[rt], 0)+1);
			
			list.add(map.size());
			lt++;
			}	
		
		for(Integer i : list) {
			System.out.print(i+" ");
		}
		
	}
}
