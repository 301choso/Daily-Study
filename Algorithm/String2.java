package com.tj;

import java.util.Scanner;
public class String2 {
public static String main2(String input1){
	
	   		char[] Alpa = new char[input1.length()];
		   
		    for(int i=0;i<input1.length();i++) {
		    	
		    	if((int)input1.charAt(i)>90 ) {
		    		Alpa[i] = (char)((int)input1.charAt(i)-32);		    
		    	}else {
		    		Alpa[i] = (char)((int)input1.charAt(i)+32);
		    	}
		    	
		    }
		    
		    String str ="";
		    for(int j=0;j<input1.length();j++) {
		    	str+=Alpa[j];	
		    }		    
			return str;
}

	public static void main(String[] args) {
		
		    Scanner in=new Scanner(System.in);
		    String input1 = in.next(); 
		
		System.out.println(main2(input1));
		
		
		
	}
}
