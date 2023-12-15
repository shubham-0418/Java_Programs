package com.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	public static void isAnagram(String s1, String s2) {
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2)) {
			System.out.println("Anagram!");
		}
		else {
			System.out.println("Not an anagram!");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("String :");
		String ss1 = sc.nextLine();	
		String ss2 = sc.nextLine();
		
		Anagram a = new Anagram();
		a.isAnagram(ss1, ss1);
		
	}

}
