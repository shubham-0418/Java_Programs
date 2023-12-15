/*
*A Simple Application which 
**@author Shubham Patil(Expleo Gr
oup)*@since JDK17 24/07/23
*/
import java.util.*;
class Currency
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number::");
	
	int amm = sc.nextInt();
	int Hamm = amm/100;
	int Ramm1 = amm-(100*Hamm);
	int Famm = Ramm1 / 50;
	int Ramm2 = (amm - (100*Hamm)-(50*Famm));
	int Tamm = Ramm2/10;
	
	System.out.println(Tamm);
	System.out.println(Famm);
	System.out.println(Hamm);
	
	
	
	
	


  }
}