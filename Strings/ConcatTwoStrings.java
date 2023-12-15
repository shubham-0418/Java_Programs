package com.Strings;

import java.util.Scanner;

public class ConcatTwoStrings {
	
	public static void concatStrings(String s, String ss) {
		
		String s3 = s.concat(ss);
		System.out.println("String after concatination :"+s3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string :");
		String s1 = sc.next();
		System.out.println("Enter 2nd string :");
		String s2 = sc.next();
		
		ConcatTwoStrings.concatStrings(s1, s2);
		
		
	}

}
