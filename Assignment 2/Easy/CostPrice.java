/*
*A Simple Application which prints  Cost price of each element
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
class CostPrice
{
  public static void main(String args[])
  {
   int i=15;
   int sp=Integer.parseInt(args[0]);
   int tp=Integer.parseInt(args[1]);
   int cp=(sp-tp)/15;
   System.out.println(cp);
   
   
  }
}