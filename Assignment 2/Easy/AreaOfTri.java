/*
*A Simple Application which prints Area of Triangle
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
public class AreaOfTri
{

  public static void main(String args[])
  { 
	  Scanner sc=new Scanner(System.in);

	 
	  System.out.println("Enter the three sides of triangle::");
	  int s1=sc.nextInt();
	  int s2=sc.nextInt();
	  int s3=sc.nextInt();
	  int b=5,h=10;
	  //calculate semiPerimeter
	  float s=(s1+s2+s3)/2;
	  //calculate Area of triangle
	  double A=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	  System.out.println(A);
	  
	  
	  
  }
}