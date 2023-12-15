/*
*A Simple Application which prints the total marks and percentage
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class percentage
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Three subject marks::");
	  int s1=sc.nextInt();
	  int s2=sc.nextInt();
	  int s3=sc.nextInt();
      int total=s1+s2+s3;
	  System.out.println(total);
	  float per=total/3;
	  System.out.println("Percentage of robert is:"+per);
  }
}