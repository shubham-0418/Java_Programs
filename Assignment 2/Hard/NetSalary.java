/*
*A Simple Application which 
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class NetSalary
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number::");
	
	int BasicSalary = sc.nextInt();
	int tax = sc.nextInt();
	double DA = (BasicSalary * 70)/100;
	System.out.println(DA);
	double HRA = (BasicSalary * 7)/100;
	System.out.println(HRA);
	double MA = (BasicSalary * 2)/100;
	System.out.println(MA);
	double TA = (BasicSalary * 4)/100;
	System.out.println(TA);
	double PF = (BasicSalary * 12)/100;
	System.out.println(PF);
	
	double All = DA + HRA + MA + TA;
	double Ded = tax + PF;
	
	double NetSalary = BasicSalary + All - Ded;
	
	System.out.println(NetSalary);
	


  }
}