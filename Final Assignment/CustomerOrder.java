/**
*	 supply the available stock and inform as ‘Out of stock.
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class CustomerOrder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int stock =sc.nextInt();
		int order =sc.nextInt();
		String credit = sc.next();   
		
		
		if(credit.equalsIgnoreCase("n"))
		{
			if(stock>order){
				System.out.println(order +" Supplied");
			}else{
				order = order - stock;
				System.out.println(stock +" Supplied . Out of stock. Balance will be refunded.");
			}
		}else{
			System.out.println("Cannot supply");
		}
		
		
	}
}