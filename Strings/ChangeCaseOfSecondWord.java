package com.Strings;

import java.util.Scanner;

public class ChangeCaseOfSecondWord {
	
	public static void changeCase(String s) {
		
		String sa[] = s.split("\\s");
		if(sa.length>=2)
		System.out.println("Result :"+sa[1].toUpperCase());
		else
			System.out.println("LESS");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("String :");
		String s1 = sc.nextLine();
		
		ChangeCaseOfSecondWord c = new ChangeCaseOfSecondWord();
		c.changeCase(s1);
//		System.out.println(s1);
	}

}
