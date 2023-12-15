package com.Strings;

import java.util.Scanner;

public class ReplaceAllVowels {
	
	
	
	public String replaceString(String s) {
		
		return s.replaceAll("[aeiou]", "z");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("String :");
		String s1 = sc.next();

		ReplaceAllVowels replaceAllVowels = new ReplaceAllVowels();
		
		System.out.println(replaceAllVowels.replaceString(s1));
	}

}
