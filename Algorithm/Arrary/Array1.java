package com.tj;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1 { //오답

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] array = new int[n]; 
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		
		answer.add(array[0]);
		for(int j=1;j<n;j++){
			if(array[j]>array[j-1]) {
				answer.add(array[j]);
			}	
		}
		
		for(int x : answer){
			System.out.print(x+" ");
		} 
		
		
		
	}

}
