package com.oop;

public class Account {
	private String id;
	private String name;
	private int balance = 0;
	
	public Account() {}
	
	public Account(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getBalance() {
		return balance;
	}
	
	public int credit(int amount) {
		balance = balance + amount;
		return balance;
	}
	
	public int debit(int amount) {
		if(amount<=balance) {
			balance = balance - amount;
			return balance;
		}else {
			System.out.println("Amount exceed balance");
			return balance;
		}
	}
	
	public int transferTo(Account another,int amount) {
		if(amount<=balance) {
			balance = balance - amount;
			another.balance = another.balance + amount;
			return balance;
		}else {
			System.out.println("Amount exceed balance");
			return balance;
		}
	}
	
	//to String method
	public String toString() {
		return "Invoice[id="+id+",Name="+name+",balance="+balance;  
		}

	
	
	
	
	
	
	
	

}
