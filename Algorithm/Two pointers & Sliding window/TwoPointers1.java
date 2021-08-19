package com.tj;

import java.util.Arrays;
import java.util.Scanner;

public class TwoPointers1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int[] arr=new int[A];
		for(int i=0;i<A;i++) {
			arr[i]=sc.nextInt();
		}
		
		int B = sc.nextInt();
		int[] arr2=new int[B];
		for(int i=0;i<B;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int[] arr3=new int[A+B];
		System.arraycopy(arr, 0, arr3, 0, A);
		System.arraycopy(arr2, 0, arr3, A, B);
		Arrays.sort(arr3);
		
		for(int i:arr3) {
			System.out.print(i+" ");
		}
	}

}
