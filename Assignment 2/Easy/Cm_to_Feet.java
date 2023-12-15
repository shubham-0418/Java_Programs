/*
*A Simple Application which prints Converting Cm to Feet
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class Cm_to_Feet 
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no in Centimeter:");
	  int cm=sc.nextInt();
	  float feet=cm/30;
	  System.out.println(" centimeter to feet:"+feet);
   
   
  }
}