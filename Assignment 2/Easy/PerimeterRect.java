/*
*A Simple Application which prints Perimeter of Rectangle
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class PerimeterRect 
{
  public static void main(String args[])
  {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Length and Breadth::");
	  int l=sc.nextInt();
	  int b=sc.nextInt();
	  int Perimeter=2*(l+b);
	  System.out.println("Perimeter of Rectangle="+Perimeter);
   
   
  }
}