/*
*A Simple Application which prints Cube of given number
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class Cube 
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number :");
	  int cube=sc.nextInt();
	  System.out.println("Cube of Given Number:"+(cube*cube*cube));
	  
   
  }
}