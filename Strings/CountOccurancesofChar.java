package com.Strings;

import java.util.Scanner;

public class CountOccurancesofChar {
	
	public static void countOfChar(String s, char c) {
		
		char[] ch = s.toCharArray();
		int count = 0;
		for(char c1 : ch)
		{
			if(c1==c) 
				count++;
		}
		System.out.print("Count Of Charachter :"+count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("String :");
		String s1 = sc.next();
		
		System.out.print("Character :");
		char c2 = sc.next().charAt(0);
		
		CountOccurancesofChar.countOfChar(s1, c2);
}
	}
