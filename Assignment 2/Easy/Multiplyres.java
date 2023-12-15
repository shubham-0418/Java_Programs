/*
*A Simple Application which prints Multiply the result
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class Multiplyres 
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number :");
	  int num=sc.nextInt();
	  int num1=num+8;
	  int no=num1/3;
	  int rem=no%5;
	  int n=rem*5;
	  System.out.println(n);
   
  }
}