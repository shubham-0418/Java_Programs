/*
*A Simple Application which swap the number
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class Swapping
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers::");
	  int n1=sc.nextInt();
	  int n2=sc.nextInt();
	  System.out.println("Before Swapping"+"\n n1="+n1+"\n n2="+n2);
	
	  int temp=n1;
	  n1=n2;
	  n2=temp;
	 System.out.println("After  Swapping"+"\n n1="+n1+"\n n2="+n2);
	  
	  
	  //without using third variable
	  
	  n1=n1+n2;
	  n2=n1-n2;
	  n1=n1-n2;
	  System.out.println("After  Swapping without using 3rd variable:"+"\n n1="+n1+"\n n2="+n2);
	  
	  // By using XOR operator
	  n1= n1^n2;
	  n2=n1^n2;
	  n1=n1^n2;
	  System.out.println("After  Swapping  using XOR operator:"+"\n n1="+n1+"\n n2="+n2);
	  


  }
}