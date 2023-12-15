package com.Strings;

import java.util.Scanner;

public class DriverQuestionNo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("String1 :");
		String s1 = sc.next();
		System.out.println("String2 :");
		String s2 = sc.next();
		String rev ="";
		char[] ch = s2.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			rev = rev+ch[i];
		}
		System.out.println(s1.concat(rev));
		
	}

}
