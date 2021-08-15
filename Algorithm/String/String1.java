package com.tj;

import java.util.Scanner;

public class String1 {
	public static int main2(String input1, String input2){
	    int sum=0;
		   
		    input1=input1.toLowerCase();
		    input2=input2.toLowerCase();
		    for(int i=0;i<input1.length();i++) {
		    	
		    	if(input1.charAt(i)==input2.charAt(0) ) {
		    		sum++;
		    	}
		    }
		  
		    System.out.println(sum);
			return sum;
}
	public static void main(String[] args) {
		
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next(); //입력
		    String input2 = in.next(); //찾고자 하는 문자열
		   
		  main2(input1, input2);
		
	}
}

