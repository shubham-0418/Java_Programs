/*
*A Simple Application which prints  RupeeConversion
**@author Shubham Patil(Expleo Group)
*@since JDK17 24/07/23
*/
class RupeeConversion
{
  public static void main(String args[])
  {
   System.out.println("Convert the Ruppee into another currency:");
   int rup=Integer.parseInt(args[0]);
   double usDol=rup*0.012;
   double euro=rup*0.011;
   double pound=rup*0.0095;
   double sterling=rup*0.0095;
   double jYen=rup*1.73;
   double dinar=rup*16.00;
   System.out.println(rup+"\n "+usDol+"\n "+euro+" \n"+pound+"\n "+sterling+" \n"+jYen+" \n"+dinar);
   
   
   
  }
}