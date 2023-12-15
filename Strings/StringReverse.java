package com.Strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string :");
		String s1 = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(s1);
		System.out.println("Here is the revered string :"+sb.reverse());
//		System.out.println(sb.reverse());
	}

}
