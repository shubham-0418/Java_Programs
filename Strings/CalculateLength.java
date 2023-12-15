package com.Strings;

import java.util.Scanner;

public class CalculateLength {
	
	public static void calculateLengthOfString(String s) {
		
		
		
		int length = s.length();
		
		System.out.println("Length of given string is :"+length);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a string :");
		String s1 = sc.nextLine();
		
//		CalculateLength cl = new CalculateLength();
		CalculateLength.calculateLengthOfString(s1);

	}

}
