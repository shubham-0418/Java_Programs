/*
*A Simple Application which prints reverse number
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class ReverseNum
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number::");
	  int n=sc.nextInt();
	  System.out.println("Orignal number="+n);
	  int rem,rev=0;
	  while(n!=0)
	  {
	    rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	  }
	  System.out.println("Reverse number="+rev);
  }
}