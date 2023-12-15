package com.oop;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account account = new Account("ABC","Shubham");
		Account accountone = new Account("Def","Devansh");
		Account temp;
		String id,name;
		int balance;
		int choice;
		
	        
	        
	 
	        do {
	        	
	        	System.out.println("1.Credit\n2.Debit\n3.TransferTo\n4.Exit");
	    		
	    		System.out.println("****************************************************");
	        	
	       choice = sc.nextInt();
	        // Switch statement with int data type
	        switch (choice) {
	 
	        // Case
	        case 1:
	        	
	            System.out.println("Enter ID:");
	        	 id = sc.next();
	        	System.out.println("Enter Amount");
	        	int amount = sc.nextInt();
	        	
	        	if(id.equalsIgnoreCase(account.getId())){
	        		account.credit(amount);
	        		temp = account;
	        		System.out.println("Account credited successfully");
	        	}else if(id.equalsIgnoreCase(accountone.getId())){
	        		accountone.credit(amount);
	        		temp = accountone;
	        		System.out.println("Account credited successfully");
	        	}else {
	        		System.out.println("Enter Vaild Input");
	        		break;
	        	}
	        	
	    		System.out.println("ID :\t\t"+temp.getId());
	    		System.out.println("Name :\t\t"+temp.getName());
	    		System.out.println("Balance :\t"+temp.getBalance());
	    		System.out.println("****************************************************");
	            break;
	 
	        // Case
	        case 2:
	            
	        	
	            System.out.println("Enter ID:");
	        	id = sc.next();
	        	System.out.println("Enter Amount");
	        	amount = sc.nextInt();
	        	
	        	if(id.equalsIgnoreCase(account.getId())){
	        		account.debit(amount);
	        		temp = account;
	        		System.out.println("Account Debited successfully");
	        	}else if(id.equalsIgnoreCase(accountone.getId())){
	        		accountone.debit(amount);
	        		temp = accountone;
	        		System.out.println("Account Debited successfully");
	        	}else {
	        		System.out.println("Enter Vaild Input");
	        		break;
	        	}
	        	
	    		System.out.println("ID :\t\t"+temp.getId());
	    		System.out.println("Name :\t\t"+temp.getName());
	    		System.out.println("Balance :\t"+temp.getBalance());
	    		System.out.println("****************************************************");
	        	
	            break;
	 
	            // Case
	        case 3:
	        	System.out.println("Enter ID of Receiver:");
	        	id = sc.next();
	        	System.out.println("Enter Amount");
	        	amount = sc.nextInt();
	        	
	        	if(id.equalsIgnoreCase(account.getId())){
	        		accountone.transferTo(account, amount);
	        		temp = account;
	        		
	        		System.out.println("****************************************************");
	        		System.out.println("ID :\t\t"+temp.getId());
		    		System.out.println("Name :\t\t"+temp.getName());
		    		System.out.println("Balance :\t"+temp.getBalance());
		    		System.out.println("****************************************************");
	        		System.out.println("Account credited successfully");
	        	}else if(id.equalsIgnoreCase(accountone.getId())){
	        		account.transferTo(accountone, amount);
	        		temp = accountone;
	        		
	        	}else {
	        		System.out.println("****************************************************");
	        		System.out.println("Enter Vaild Input");
	        		break;
	        	}
	        	
	    		System.out.println("****************************************************");
	    		System.out.println("ID :\t\t"+temp.getId());
	    		System.out.println("Name :\t\t"+temp.getName());
	    		System.out.println("Balance :\t"+temp.getBalance());
	    		System.out.println("****************************************************");
	        	
	        	break;
	        	
	        case 4:
	        	System.exit(0);
	        	
	        default :
	        	System.out.println("Wrong Input");
		
	        }
	     }while(choice!=0);
	}

}
