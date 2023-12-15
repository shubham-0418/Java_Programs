package com.Strings;

import java.util.Scanner;

public class CountEachCharOccur {
	
	public String countEachCharOccur(String s){
		
		char[] ch = s.toCharArray();
		
		for(int i =0; i<ch.length;i++) {
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			if(ch[i]!=' ')
				System.out.println(ch[i]+"-"+count);
		}
		
		
		return s;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String :");
		String s1 = sc.nextLine();
		System.out.println("count of each character :");
		
		CountEachCharOccur c = new CountEachCharOccur();
		c.countEachCharOccur(s1);
	}

}
