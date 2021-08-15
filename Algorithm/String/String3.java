package com.tj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String3 {
	public static String main2(String[] strs){
		int cnt=0; String str="";
			for(int i=0;i<strs.length;i++) {
				if(cnt<strs[i].length()) {
					cnt=strs[i].length();
					str = strs[i];
				}		 
			}
			return str;
		} 
public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String[] strs = br.readLine().split(" ");
	String str = main2(strs);
	 
	 System.out.println(str);
		
	}
}
