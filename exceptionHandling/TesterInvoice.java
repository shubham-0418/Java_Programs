package com.exceptionHandling;

import java.util.Scanner;

import com.oop.InvoiceItem;

class InputMismatchedException extends Exception{
	public InputMismatchedException(String s) {
//		Super(s);
	}
}

class Invoice{
	
	int partNumber;
	String partDescription;
	int quantity;
	double price;
	
	public Invoice(int partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	
}


public class TesterInvoice {

	public static void main(String[] args) throws InputMismatchedException{
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Part Number :");
			int partNumber = sc.nextInt();
			if(partNumber<=0)
				throw new InputMismatchedException("Input must be integer");
			
			System.out.println("Part Description :");
			String partDescription = sc.next();
			if(partDescription=="null")
				throw new InputMismatchedException("Input must be string type");
			System.out.println("Quantity :");
			int quantity = sc.nextInt();
			if(quantity<=0)
				throw new InputMismatchedException("Quantity must be greater than 0");
			System.out.println("Price :");
			double price = sc.nextDouble();
			if(price<=0)
				throw new InputMismatchedException("Price must be greater than 0");
			
			Invoice i = new Invoice(partNumber, partDescription, quantity, price);
			System.out.println(partNumber);
			System.out.println(partDescription);
			System.out.println(quantity);
			System.out.println(price);
			
		} catch (InputMismatchedException e) {
			System.out.println(e);
		}
		
	}

}
