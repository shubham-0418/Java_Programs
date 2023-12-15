/*
*A Simple Application which prints student details
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
import java.util.*;
class StudentsData
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number::");
	  int Go=sc.nextInt();
	  int Gm=sc.nextInt();
	  int Bo=sc.nextInt();
	  int Bm=sc.nextInt();
	  System.out.println("Students who like Oranges"+(Go+Bo));
	  System.out.println("Students who likes Mangoes "+(Gm+Bm));
	  System.out.println("Total number of Students "+(Gm+Bm+Go+Bo));
	  if((Go+Gm)>(Bo+Bm))
	  {
	  System.out.println(true);
	  }
	  else
	  {
	  System.out.println(false);
	  }

  }
}