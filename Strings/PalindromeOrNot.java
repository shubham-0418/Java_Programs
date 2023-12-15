package com.Strings;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string :");
		String s1 = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s1);
//		System.out.println("Here is the revered string :");
		StringBuilder reveresedString = sb.reverse();
//		System.out.println(sb.reverse());
		
		if(s1.equals(reveresedString.toString()))
		{
			System.out.println("String is palindrome!");
		}
		else {
			System.out.println("String is not palindrome!");
		}
	}

}
