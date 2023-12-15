package com.Strings;

import java.util.Scanner;

public class PasswordCheck {
	
	public static void checkPassword(String s) {
		boolean isNumberPresent=false;
		boolean isLowerCase=false;
		boolean isAppropriateLength=false;
		boolean isUpperCase=false;
		boolean isSpecialChar=false;
		if(s.matches(".*[a-z].*")) {
			isLowerCase=true;
		}
		if(s.matches(".*[A-Z].*")) {
			isUpperCase=true;
		}
		if(s.length()>=8) {
			isAppropriateLength=true;
		}
		if(s.matches(".*[0-9].*")) {
			isNumberPresent=true;
		}
		if(s.matches(".*[$&+,:;=?@#|'<>.-^*()%!].*")){
			isSpecialChar=true;
		}
		System.out.println(isLowerCase+" "+isUpperCase+" "+isAppropriateLength+" "+isNumberPresent+" "+isSpecialChar);
		
		if(isLowerCase&&isUpperCase&&isAppropriateLength&&isNumberPresent&&isSpecialChar) {
			System.out.println("Password is Strong!");
		}
		else
		{
			System.out.println("Password  is not strong");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Password :");
		String s1 = sc.nextLine();
		
		PasswordCheck c = new PasswordCheck();
		
		c.checkPassword(s1);

	}

}
