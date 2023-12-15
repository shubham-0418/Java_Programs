package com.oop;

public class TestInvoiceItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InvoiceItem invoice = new InvoiceItem("Abc1","HandMade",50,100.0);
		System.out.println("ID :\t\t"+invoice.getId());
		System.out.println("Desc :\t\t"+invoice.getDesc());
		System.out.println("qty :\t\t"+invoice.getQty());
		System.out.println("unitPrice :\t"+invoice.getUnitPrice());
		System.out.println("TotalAmount :\t"+invoice.getTotal());
		
		System.out.println("****************************************************");
		System.out.println(invoice.toString());
		System.out.println("****************************************************");
		
		invoice.setQty(30);
		invoice.setUnitPrice(99);
		System.out.println("ID :\t\t"+invoice.getId());
		System.out.println("Desc :\t\t"+invoice.getDesc());
		System.out.println("qty :\t\t"+invoice.getQty());
		System.out.println("unitPrice :\t"+invoice.getUnitPrice());
		System.out.println("TotalAmount :\t"+invoice.getTotal());
		
		System.out.println("****************************************************");
		System.out.println(invoice.toString());
		System.out.println("****************************************************");
		

	}

}
