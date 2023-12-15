package com.inheritancPolymorphism;
import java.util.*;

class Account
{

    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) 
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    
    void deposit(double amount)
    {
        balance = balance + amount;
    }

    void withdraw(double amount)
    {
        if(balance < amount) 
        {

            System.out.println("Insufficient Balance");

        }
        else 
        {
            balance = balance - amount;
        }

    }
    public String getAccountNumber()
    {
        return accountNumber;
    }
    public double getBalance() 
    {
        return balance;
    }
    void displayInfo()
    {
        System.out.println("Account Number :"+accountNumber);
        System.out.println("Account Balance :"+balance);
    }

}

 

class SavingsAccount extends Account
{
    private double interestRate = 8;

    public SavingsAccount(String accountNumber, double balance)
    {
        super(accountNumber, balance);
    }

    void addInterest()
    {
        balance = balance + (balance/100)*interestRate;
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Interest:"+ interestRate);
    }

}

class CurrentAccount extends Account
{
    private double overdraftLimit = 1500;
    public CurrentAccount(String accountNumber, double balance)
    {
        super(accountNumber, balance);
    }
    public double getOverdraftLimit() 
    {
        return overdraftLimit;
    }
    void displayInfo() 
    {
        super.displayInfo();
        System.out.println("Over Draft Limit :"+ (balance+overdraftLimit));
    }
}
public class TesterBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int choice;       
        SavingsAccount acc = new SavingsAccount("ABCDE", 20000);
        CurrentAccount curr = new CurrentAccount("DEFGH",10000);
            do 
            {
                System.out.println("****************************************************");
                System.out.println("1.Saving Account\n2.Current Account\n3.Exit");
                System.out.println("****************************************************");
            choice = sc.nextInt();
            // Switch statement with int data type

            switch (choice)
            {
            // Case
            case 1:
                System.out.println("****************************************************");
                acc.displayInfo();
                System.out.println("****************************************************");
                int choiceOne;

                do 
                {
                    System.out.println("****************************************************");
                    System.out.println("1.Deposit Money\n2.Withdraw Money\n3.Show Account Data\n4. Add Interest\n5.exit");
                    System.out.println("****************************************************");
                   choiceOne = sc.nextInt();
                    if(choiceOne == 1)
                    {
                        System.out.println("Enter the amount");
                        double Deposit = sc.nextDouble();
                        acc.deposit(Deposit);
                        System.out.println("Deposit Successfull");
                        System.out.println("****************************************************");
                    }
                    else if(choiceOne == 2)
                    {
                        System.out.println("Enter the amount");
                        double Deposit = sc.nextDouble();
                        acc.withdraw(choice);
                    }
                    else if(choiceOne == 3)
                    {

                        acc.displayInfo();
                    }
                    else if(choiceOne == 4)
                    {
                        acc.addInterest();
                    }
                    else 
                    {
                        choiceOne = 5;
                    }
                }
                while(choiceOne<5);
                System.out.println("****************************************************");
                break;

            // Case
            case 2:
                System.out.println("***************************************************");
                curr.displayInfo();
                System.out.println("****************************************************");

                do 
                {

                    System.out.println("****************************************************");
                    System.out.println("1.Deposit Money\n2.Withdraw Money\n3.Show Account Data\n4.exit");
                    System.out.println("****************************************************");
                   choiceOne = sc.nextInt();
                    if(choiceOne == 1) 
                    {
                        System.out.println("Enter the amount");
                        double Deposit = sc.nextDouble();
                        curr.deposit(Deposit);
                        System.out.println("Deposit Successfull");
                        System.out.println("****************************************************");
                    }
                    else if(choiceOne == 2)
                    {
                        System.out.println("Enter the amount");
                        double Deposit = sc.nextDouble();
                        curr.withdraw(choice);
                    }
                    else if(choiceOne == 3)
                    {
                        curr.displayInfo();

                    }
                    else
                    {

                        choiceOne = 4;
                    }
                }while(choiceOne<=4);
                System.out.println("****************************************************");
                break;

                // Case
            case 3:
                System.exit(4);
            default :
                System.out.println("Wrong Input");

            }

         }while(choice!=0);
		

	}

}
