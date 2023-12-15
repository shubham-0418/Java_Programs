package com.exceptionHandling;


import java.util.Scanner;

class PayOutOfBoundsException extends Exception{
	
	public PayOutOfBoundsException(String s) {
//		Super(s);
	}
}

public class AccountManagement {
	
	 int amount;
	 static int accountBalance=80000;
	 static int limit = 30000;
	
	public AccountManagement(int amount) {
		super();
		this.amount = amount;
		
	}

	
	
	public static int checkForDebit(int amount, int accountBalance, int limit) throws PayOutOfBoundsException {
		if(amount<=limit) {
			accountBalance = accountBalance-amount;
		System.out.println("Amount is less than the limit so you can do the withdraw!");}
		else
			throw new PayOutOfBoundsException(" the transaction amount exceeds the limit ");
		return accountBalance;
	}
	
	public static  int withdrawAmount(int amount, int accountBalance) throws PayOutOfBoundsException {
		if(amount<accountBalance) {
			accountBalance = accountBalance-amount;
		System.out.println("Withdraw Successful and your"+" "+"accountBalance is :"+accountBalance);}
		else
			throw new PayOutOfBoundsException("the amount is insufficient");
		return accountBalance;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Amount :");
		int amount = sc.nextInt();
		
		AccountManagement am = new AccountManagement(10000);
		try {
			am.checkForDebit(amount, accountBalance, limit);
			am.withdrawAmount(amount, accountBalance);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	
		
	}

}
