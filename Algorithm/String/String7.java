package com.tj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String7 { //회문문자열

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		str=str.toLowerCase();
		
		int cnt=str.length()/2;
		int count=0;
		for(int i=0;i<cnt;i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				count++;
			}
		}
		if(count==cnt) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
