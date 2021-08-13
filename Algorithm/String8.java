package com.tj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine().toLowerCase();		
		String[] strs=str.split(" ");
		
		int cnt=strs.length/2;
		int count=0;
		for(int i=0;i<cnt;i++) {
			strs[i]="";
			for(int j=0;j<strs[i].length();j++) { //뒤집어 넣은 후 포함하는지 확인
				strs[i]+=strs[i].charAt(strs[i].length()-j);
			}
			
			if(strs[strs.length-1-i].contains(strs[i])) {
				count++;
			}else {
				break;
			}
		}
			
		
		if(count==cnt) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}

