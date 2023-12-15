/*
*A Simple Application which prints Converting Kilograms to Grams
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class Kg_to_G 
{
  public static void main(String args[])
  {
     Scanner sc=new Scanner(System.in);
	 
	  System.out.println("Enter number in kg");
      int g= sc.nextInt();
	  int kg=g*1000;
	  System.out.println("Converting Kilograms to Grams:"+kg);
   
   
  }
}